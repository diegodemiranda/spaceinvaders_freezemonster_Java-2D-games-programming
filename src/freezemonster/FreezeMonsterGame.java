package freezemonster;

import java.awt.EventQueue;

import spriteframework.AbstractBoard;
import spriteframework.MainFrame;

public class FreezeMonsterGame extends MainFrame {


    public FreezeMonsterGame () {
        super("Freeze Monsters");
    }

    protected  AbstractBoard createBoard() {
        return new FreezeMonsterBoard();
    }


    public static void main(String[] args) {

        EventQueue.invokeLater(FreezeMonsterGame::new);
    }

}
