package printqueue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
/**
 * Class: Splash
 * Description: Splash class representing a window on the screen.
 * @author Muhammed Guroglu and Nomingerel Tserenjav
 */
public class Splash extends JWindow
{
    JProgressBar loading = new JProgressBar();
    private final int DURATION;
    private int progress;
   /**
     * Constructor integer duration
     *
     * @param dur int
     */
    public Splash (int dur)
    {
        DURATION = dur;
    }
    
    public void showSplash()
    {
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.lightGray);
        
        //set the window's bounds, center the window
        int width = 454;
        int height = 331;
        Dimension screen =  Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x, y, width, height);
        
        JLabel imageLabel = new JLabel(new ImageIcon("src/printqueue/printer.jpg"));
        content.add(imageLabel, BorderLayout.CENTER);
        content.add(loading, BorderLayout.SOUTH);
        Color border = new Color(50, 20, 20, 55);
        content.setBorder(BorderFactory.createLineBorder(border, 10));
        
        //Display it
        this.setVisible(true);
        
        // Wait a little while, maybe while loading resources
        try
        {
            //Increment the progress bar's value to 100 starting from 0
            incProgress(100);
            Thread.sleep(DURATION);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        this.setVisible(false);
    }
    
    public void incProgress(int incProgress) throws InterruptedException
    {
        //Instantiate and start new thread
        Progress up = new Progress(incProgress);
        up.thread.start();
    }
    
    //Nested class to run new thread 
    class Progress
    {
    private int incProgress;

    public Progress(int value)
    {
        this.incProgress = value;
    }
        private Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                //Increment the progress bar until it's value hits 100.
                while (progress < incProgress)
                {
                    progress++;
                    try
                    {
                        Thread.sleep(24);
                    }
                    catch (InterruptedException ex)
                    {

                    }
                    loading.setValue(progress);
                }

            }
        });
    }
}
