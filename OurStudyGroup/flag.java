//package OurStudyGroup;
//
//import javax.swing.*;
//import java.awt.*;
//
//
//public class flag {
//
//        public static void main(String[] args) {
//
//            Uyghur();
//
//        }
//
//        public static void Uyghur() {
//            Grid grid = new Grid(58);
//            int r = grid.getHt(),  c = grid.getWd(),size = 6,  sH = r / size,
//                    sW = c / size, sX = r/4, sY = r-8+(r/10), mX = r/6, mY = r/3-(r/15);
//            sW += sW / 2 + 1;
//            Color bg = new Color(85,158,226), star = Color.WHITE;
//            for (int i = 0; i < r-3; i++)
//                for (int j = 0; j < c-8; j++)
//                    grid.setColor(i, j, bg);
//            for (int row = sX, st = 0, con = 0; row < sX + sH - 1; row++, con++) {
//                con = con > 1 ? 0 : con;   st += con == 0 ? 1 : 0;
//                for (int col = sY, count = 0; col < sY + sW; col++, count++)
//                    grid.setColor(row, col, (count <= sW / 2 - st || count >= sW / 2 + st )? bg : star);
//            }
//            sX += sH - 1;
//            for (int row = sX, blank = 0; row < sX + sH / 2; row++, blank += 2)
//                for (int col = sY, count = 0; col < sY + sW; col++, count++)
//                    if (count >= blank && count <= sW - blank)
//                        grid.setColor(row, col, star);
//            sX += sH / 2;
//            for (int row = sX, blank = sH, con = 0; row < sX + sH; row++, con++) {
//                con = con > 1 ? 0 : con;
//                blank -= con == 0 ? 1 : 0;
//                for (int col = sY+2, count = 2; col < sY + sW; col++, count++)
//                    if (count > blank && count < sW - blank - 1)
//                        grid.setColor(row, col, star);
//            }
//            for (int row = sX + sH / 5, blank = 0, con = 0; row < sX + sH; row++, con++) {
//                con = con > 1 ? 0 : con;
//                blank += con == 0 ? 1 : blank > 4 ? 1 : 2;
//                for (int col = sY, count = 0; col < sY + sW; col++, count++)
//                    if (count > sW / 2 - blank && count < sW / 2 + blank)
//                        grid.setColor(row, col, bg);
//            }
//            for (int row = mX, n = sH * 2+1, i = -n; i <= n; i++) {
//                for (int col = mY, j = -n+1; j <= n; j++, col++) {
//                    if (i * i + j * j <= n * n)      grid.setColor(row, col+1, star);
//                    else    System.out.print(" ");
//                }
//                row++;
//            }
//            for (int row = mX+sH/3, n = (sH * 2)-sH/3, i = -n-1; i <= n; i++) {
//                for (int col = mY+sH, j = -n; j <= n; j++, col++) {
//                    if (i * i + j * j <= n * n)  grid.setColor(row, col, bg);
//                    else  System.out.print(" ");
//                }
//                row++;
//            }
//        }
//
//
//
//        private static final long serialVersionUID = 0L;
//        private static final int MARGIN_SIZE = 5, SQUARE_SIZE = 15;
//        private int scaleH, scaleW;
//        private Color[][] colors;
//        private JFrame frame;
//
//        public Grid(int scale) {
//            this.scaleH = scale;
//            this.scaleW = 2*scale;
//            int overallSizeH = scaleH + 2 * MARGIN_SIZE;
//            int overallSizeW = scaleW + 2 * MARGIN_SIZE;
//            colors = new Color[overallSizeH][overallSizeW];
//            for (int i = 0; i < overallSizeH; i++)
//                for (int j = 0; j < overallSizeW; j++)
//                    colors[i][j] = Color.LIGHT_GRAY;
//
//            javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                public void run() {
//                    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//                    createAndShowFrame();
//                }
//            });
//        }
//        public int getScale(){
//            return scaleH;
//        }
//        public int getHt() {
//            return scaleH;
//        }
//        public int getWd(){
//            return scaleW;
//        }
//        private void createAndShowFrame() {
//            frame = new JFrame("Flag");
//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            setSize((scaleW + 2 * MARGIN_SIZE) * SQUARE_SIZE,
//                    ((scaleH) + 2 * MARGIN_SIZE) * SQUARE_SIZE);
//            frame.setContentPane(this);
//            frame.pack();
//            frame.setVisible(true);
//            frame.toFront();
//            frame.setAlwaysOnTop(true);
//        }
//
//        public void setColor(int row, int col, Color color) {
//            colors[row + MARGIN_SIZE][col + MARGIN_SIZE] = color;
//            this.repaint();
//        }
//
//        public Color getColor(int row, int col) {
//            return colors[row + MARGIN_SIZE][col + MARGIN_SIZE];
//        }
//
//        public void kill() {
//            if (frame != null)
//                frame.dispose();
//        }
//
//        public Dimension getPreferredSize() {
//            return new Dimension((scaleW + 2 * MARGIN_SIZE) * SQUARE_SIZE + 1,
//                    ((scaleH) + 2 * MARGIN_SIZE) * SQUARE_SIZE + 1);
//        }
//
//        public void paint(Graphics g) {
//            super.paint(g);
//
//            int offset = MARGIN_SIZE * SQUARE_SIZE;
//
//            for (int i = 0; i < scaleH + 2 * MARGIN_SIZE; i ++)
//                for (int j = 0; j < scaleW + 2 * MARGIN_SIZE; j++) {
//                    g.setColor(colors[i][j]);
//                    g.fillRect(j * SQUARE_SIZE + 1, i * SQUARE_SIZE + 1,
//                            SQUARE_SIZE, SQUARE_SIZE);
//                }
//            g.setColor(Color.BLACK);
//            for (int i = 0; i < scaleW + 1; i++)
//                g.drawLine(offset + i * SQUARE_SIZE, offset,
//                        offset + i * SQUARE_SIZE, offset + scaleH * SQUARE_SIZE);
//            for (int j = 0; j < scaleH + 1; j++)
//                g.drawLine(offset, offset + j * SQUARE_SIZE,
//                        offset + scaleW * SQUARE_SIZE, offset + j * SQUARE_SIZE);
//        }
//    }
//
//}
//
//
//
//
//
//
//
//}
