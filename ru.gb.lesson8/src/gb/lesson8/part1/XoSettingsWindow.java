package gb.lesson8.part1;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XoSettingsWindow extends JFrame { //наследование от класса, отрисовывающего окно

    private static final int WINDOW_WIDTH = 350; //ширина окна
    private static final int WINDOW_HEIGHT = 270; //высота окна
    private static final int MIN_WIN_LENGTH = 3; //минимальная длина выигрыша
    private static final int MIN_FIELD_SIZE = 3; //минимальная длина поля
    private static final int MAX_FIELD_SIZE = 10; //максимальная длина поля
    private static final String FIELD_SIZE_PREFIX = "Размер поля: "; //вывод постоянной строки "Размер поля"
    private static final String WIN_LENGTH_PREFIX = "Длина победы в символах: "; //вывод постоянной строки "Длина победы"

    private XoWindow xoWindow; //ссылка на основное приложение для возврата параметров из окна настроек
    private JRadioButton humVSAI; //кнопка выбора режима со значением "Против компьютера"
    private JRadioButton humVShum; //кнопка выбора режима со значением "Против человека"
    private JSlider slideWinLen; //ползунок выбора длины победы
    private JSlider slideFieldSize; //ползунок выбора размера поля

    public XoSettingsWindow(XoWindow xoWindow) {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);//определить размер окна
        this.xoWindow = xoWindow; //передача ссылки на основное приложение для возврата параметров из окна настроек
        Rectangle gameWindowBounds = xoWindow.getBounds(); //получаем размеры основного окна
        int posX = (int) gameWindowBounds.getCenterX() - WINDOW_WIDTH / 2; //получили центр окна по X, сдвинулись на половину ширины
        int posY = (int) gameWindowBounds.getCenterY() - WINDOW_HEIGHT / 2; //получили центр окна по Y, сдвинулись на половину высоты
        setLocation(posX, posY); //закрепили позицию окна настроек по полученным значениям
        setResizable(false); //запрет на изменение размера
        setTitle("Создать игру"); // создаем заголовок
        setLayout(new GridLayout(8, 1)); //отрисовка поля по 8 строк в 1 столбец
        addGameModeButtons();
        addGameControls();

        JButton btnStart = new JButton("Создать новую игру"); //создать кнопку "Создать новую игру"
        btnStart.addActionListener(new ActionListener() { //анонимный класс
            @Override
            public void actionPerformed(ActionEvent e) { //переопределение метода на выполнение действия
                classStartGame();
            }
        });
        add(btnStart); //после выполнения кнопка возвращает основному окну выбранные настройки
    }

    private void addGameModeButtons() {
        JLabel label = new JLabel(" Выберите режим"); //создать надпись
        add(label); //отобразить надпись
        humVSAI = new JRadioButton("Человек vs Компьютер"); //кнопка выбора режима со значением "Против компьютера"
        humVShum = new JRadioButton("Человек vs Человек"); //кнопка выбора режима со значением "Против человека"
        ButtonGroup buttonGroup = new ButtonGroup(); //сгруппировать кнопки
        buttonGroup.add(humVSAI);
        buttonGroup.add(humVShum);
        humVSAI.setSelected(true); //кнопка "Человек против компьютера" выбрана по умолчанию
        add(humVSAI);
        add(humVShum);
    }

    private void addGameControls() {
        JLabel lbFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE); //строка "Размер поля + значение в символах"
        JLabel lbWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH); //строка "Длина победы + значение в символах"
        slideFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE); //слайдер размера поля от минимального значения до максимального с минимальным по умолчанию
        slideWinLen = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_FIELD_SIZE); //слайдер длины победы с минимальным значением до максимального с минимальным по умолчанию, зависящим от максимального значения размера поля

        slideFieldSize.addChangeListener(new ChangeListener() { //изменение состояния слайдера размера поля
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = slideFieldSize.getValue(); //текущее значение слайдера
                lbFieldSize.setText(FIELD_SIZE_PREFIX + currentValue); //отрисовка значения
                slideWinLen.setMaximum(currentValue); //установить длину победы в зависимости от выбранной длины поля
            }
        });

        slideWinLen.addChangeListener(new ChangeListener() { //изменение состояния слайдера длины победы
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLength.setText(WIN_LENGTH_PREFIX + slideWinLen.getValue()); //отрисовка значения
            }
        });
        add(lbFieldSize);
        add(slideFieldSize);
        add(lbWinLength);
        add(slideWinLen); //добавили строки и значения размера поля и длины победы соответственно
    }

    private void classStartGame() { //настройки игры
        int gameMode; //режим игры
        if (humVSAI.isSelected()) {
            gameMode = XoFieldPanel.GAME_MODE_HVAI;
        } else if (humVShum.isSelected()) {
            gameMode = XoFieldPanel.GAME_MODE_HVH;
        } else {
            throw new RuntimeException("Данный режим игры не поддерживается");
        }

        int fieldSize = slideFieldSize.getValue(); //выбор размера поля
        int winLength = slideWinLen.getValue(); //выбор длины победы
        xoWindow.startGame(gameMode, fieldSize, winLength);
        setVisible(false); //закрыть окно после нажатия кнопки "Старт игры"
    }


}
