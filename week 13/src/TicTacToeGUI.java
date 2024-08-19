import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TicTacToeGUI extends JFrame implements ActionListener {
        private JButton[][] buttons;
        private char currentPlayer;

        public TicTacToeGUI() {
            super("Tic Tac Toe");
            setSize(300, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(3, 3));

            buttons = new JButton[3][3];
            currentPlayer = 'X';

            initializeButtons();
        }

        private void initializeButtons() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttons[i][j] = new JButton("");
                    buttons[i][j].setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 50));
                    buttons[i][j].setFocusPainted(false);
                    buttons[i][j].addActionListener(this);
                    add(buttons[i][j]);
                }
            }
        }

        private void switchPlayer() {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        private boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (buttons[i][j].getText().equals("")) {
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean checkWinner() {
            // Check rows and columns
            for (int i = 0; i < 3; i++) {
                if (buttons[i][0].getText().equals(String.valueOf(currentPlayer))
                        && buttons[i][1].getText().equals(String.valueOf(currentPlayer))
                        && buttons[i][2].getText().equals(String.valueOf(currentPlayer))
                        || buttons[0][i].getText().equals(String.valueOf(currentPlayer))
                        && buttons[1][i].getText().equals(String.valueOf(currentPlayer))
                        && buttons[2][i].getText().equals(String.valueOf(currentPlayer))) {
                    return true;
                }
            }

            // Check diagonals
            if (buttons[0][0].getText().equals(String.valueOf(currentPlayer))
                    && buttons[1][1].getText().equals(String.valueOf(currentPlayer))
                    && buttons[2][2].getText().equals(String.valueOf(currentPlayer))
                    || buttons[0][2].getText().equals(String.valueOf(currentPlayer))
                    && buttons[1][1].getText().equals(String.valueOf(currentPlayer))
                    && buttons[2][0].getText().equals(String.valueOf(currentPlayer))) {
                return true;
            }

            return false;
        }

        private void declareWinner() {
            JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
            resetGame();
        }

        private void declareTie() {
            JOptionPane.showMessageDialog(this, "It's a tie!");
            resetGame();
        }

        private void resetGame() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    buttons[i][j].setText("");
                }
            }
            currentPlayer = 'X';
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();

            if (clickedButton.getText().equals("")) {
                clickedButton.setText(String.valueOf(currentPlayer));

                if (checkWinner()) {
                    declareWinner();
                } else if (isBoardFull()) {
                    declareTie();
                } else {
                    switchPlayer();
                }
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                TicTacToeGUI ticTacToe = new TicTacToeGUI();
                ticTacToe.setVisible(true);
            });
        }
    }

}
