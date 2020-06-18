package gb.lesson8.part1;

import javax.swing.*;
import java.awt.*;

public class XoFieldPanel extends JPanel { // наследование от класса, создающего панель

    public static final int GAME_MODE_HVAI = 0;
    public static final int GAME_MODE_HVH = 1;

    public XoFieldPanel() {
        setBackground(Color.LIGHT_GRAY); //установить цвет панельки
    }

    public void startGame(int gameMode, int fieldSize, int winLength) { // вызов метода для старта игры с параметрами (режим, длина поля,длина выигрыша)
        System.out.printf(" Game mode: %d%n Field size: %d%n Win length: %d%n", gameMode, fieldSize, winLength);
    }

}
