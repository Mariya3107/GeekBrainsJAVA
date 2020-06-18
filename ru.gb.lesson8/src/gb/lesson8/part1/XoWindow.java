package gb.lesson8.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XoWindow extends JFrame { //наследование от класса, отрисовывающего окно

    private static final int WINDOW_WIDTH = 507; //ширина окна
    private static final int WINDOW_HEIGHT = 555; //высота окна
    private static final int WINDOW_POS_X = 450; //координата X
    private static final int WINDOW_POS_Y = 250; //координата Y
    private XoSettingsWindow settingsWindow; // переменная "Окно настроек"
    private XoFieldPanel fieldPanel; //переменная игровой панели

    public XoWindow() {
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //определить размер окна
        setLocation(WINDOW_POS_X, WINDOW_POS_Y); //определить "нулевую" координату окна

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //команда "Выйти из приложения при закрытии окна"

        setTitle("Крестики - Нолики"); //добавить заголовок окна
        setResizable(false); //изменение размеров окна (false - запрет на изменение)

        this.settingsWindow = new XoSettingsWindow(this); //отобразить окно настроек

        JButton buttonStart = createStartButton(); //создать кнопку "Начать игру"
        JButton buttonExit = createExitButton(); //создать кнопку "Выйти"
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2)); //создать панельку для кнопок на 1 строку и 2 столбца

        buttonPanel.add(buttonStart); //добавить на панельку кнопку "Начать игру"
        buttonPanel.add(buttonExit); //добавить на панельку кнопку "Выйти"
        add(buttonPanel, BorderLayout.SOUTH); //добавить панельку на положение "Юг" (внизу окна)

        this.fieldPanel = new XoFieldPanel(); //добавить игровую панель в окно
        add(fieldPanel, BorderLayout.CENTER); //расположить игровую панель в центр

        setVisible(true); //отобразить окно (true - сделать видимым)
    }

    public void startGame(int gameMode, int fieldSize, int winLength) { // вызов метода для старта игры с параметрами (режим, длина поля,длина выигрыша)
        this.fieldPanel.startGame(gameMode, fieldSize, winLength);
    }

    private JButton createStartButton() {
        JButton button = new JButton("Начать игру"); //создание кнопки

        button.addActionListener(new ActionListener() { //создание анонимного класса
            @Override
            public void actionPerformed(ActionEvent e) {  //переопределение метода на выполнение действия
                settingsWindow.setVisible(true); //действие на кнопке - открыть окно настроек при нажатии на кнопку "Начать игру"
            }
        });
        return button; //возврат кнопки
    }


    private JButton createExitButton() { //описание поведения кнопки "Выйти"
        JButton button = new JButton("<html><body><b>Выйти</b></body></html>"); //создание кнопки

        button.addActionListener(new ActionListener() { //создание анонимного класса
            @Override
            public void actionPerformed(ActionEvent e) { //переопределение метода на выполнение действия
                System.exit(0); //действие на кнопке - закрыть приложение
            }
        });
        return button; //возврат кнопки
    }

}
