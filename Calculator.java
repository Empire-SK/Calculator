import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
    
    boolean isOperatorClicked=false;

    JFrame jf;
    JLabel displayLabel;
    String oldValue,newValue;
    Float result;
    int Operator;

    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divisionButton;
    JButton multiButton;
    JButton subButton;
    JButton addButton;
    JButton clearButton,NegativeButton,DelButton,BackButton;
    
    public Calculator(){
        jf =new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(500,150);  
        
        displayLabel =new JLabel("HELLO EMPIRE");
        displayLabel.setBounds(30,30,540,30);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);


        displayLabel =new JLabel();
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

        // number 7
        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(sevenButton);

        //number 8
        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(eightButton);

        //number 9
        nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(nineButton);

        //number 4
         fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(fourButton);

        // number 5
        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(fiveButton);

        // number 6
        sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(sixButton);

        // number 1
        oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(oneButton);

        // number 2
       twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(twoButton);

        // number 3
        threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(threeButton);

        // dot
        dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(dotButton);

        // number 0
        zeroButton=new JButton("0");
         zeroButton.setBounds(130,430,80,80);
         zeroButton.addActionListener(this);
         zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
         jf.add(zeroButton);

        // equal
         equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(equalButton);

        // division
       divisionButton=new JButton("/");
        divisionButton.setBounds(330,130,80,80);
        divisionButton.addActionListener(this);
        divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(divisionButton);

          // multiplication
          multiButton=new JButton("x");
          multiButton.setBounds(330,230,80,80);
          multiButton.addActionListener(this);
          multiButton.setFont(new Font("Arial",Font.PLAIN,40));
          jf.add(multiButton);
  
         // Addition
         addButton=new JButton("+");
         addButton.setBounds(330,330,80,80);
         addButton.addActionListener(this);
         addButton.setFont(new Font("Arial",Font.PLAIN,40));
         jf.add(addButton);

         // substraction
        subButton=new JButton("-");
        subButton.setBounds(330,430,80,80);
        subButton.addActionListener(this);
        subButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(subButton);

        
         // clear
         clearButton=new JButton("Clear");
         clearButton.setBounds(430,130,100,180);
         clearButton.addActionListener(this);
         clearButton.setFont(new Font("Arial",Font.PLAIN,20));
         jf.add(clearButton);

         //negative delete
         NegativeButton=new JButton("(-)");
         NegativeButton.setBounds(430,430,100,80);
         NegativeButton.addActionListener(this);
         NegativeButton.setFont(new Font("Arial",Font.PLAIN,20));
         jf.add(NegativeButton);

         //Delete
         DelButton=new JButton("Delete");
         DelButton.setBounds(430,330,100,80);
         DelButton.addActionListener(this);
         DelButton.setFont(new Font("Arial",Font.PLAIN,20));
         jf.add(DelButton);

         
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator();
    }
@Override
public void actionPerformed(ActionEvent e) 
{
    if(e.getSource() == sevenButton){
      if(isOperatorClicked){
        displayLabel.setText("7");
        isOperatorClicked=false;
      }
      else{
        displayLabel.setText(displayLabel.getText()+"7");
      }
      
    }
    else if(e.getSource()==eightButton){
        if(isOperatorClicked){
            displayLabel.setText("8");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"8");
          }
    }
    else if (e.getSource()==nineButton){
        if(isOperatorClicked){
            displayLabel.setText("9");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"9");
          }
    }
    else if (e.getSource()==fourButton){
        if(isOperatorClicked){
            displayLabel.setText("4");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"4");
          }
    }
     else if (e.getSource()==fiveButton){
        if(isOperatorClicked){
            displayLabel.setText("5");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"5");
          }
    }
    else if (e.getSource()==sixButton){
        if(isOperatorClicked){
            displayLabel.setText("6");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"6");
          }
    }
     else if (e.getSource()==oneButton){
        if(isOperatorClicked){
            displayLabel.setText("1");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"1");
          }
    } 
    else if (e.getSource()==twoButton){
        if(isOperatorClicked){
            displayLabel.setText("2");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"2");
          }
    }
    else if (e.getSource()==threeButton){
        if(isOperatorClicked){
            displayLabel.setText("3");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"3");
          }
    }
    else if (e.getSource()==zeroButton){
        if(isOperatorClicked){
            displayLabel.setText("0");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+"0");
          }
    }
    else if (e.getSource()==divisionButton){
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
         Operator=1;
    }
    else if (e.getSource()==multiButton){
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
         Operator=2;
    }
    else if (e.getSource()==addButton){
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
        Operator=3;
    }
    else if (e.getSource()==subButton){
        isOperatorClicked=true;
        oldValue=displayLabel.getText();
         Operator=4;
    }
    else if(e.getSource()==equalButton){
        newValue=displayLabel.getText();
        float oldValueF=Float.parseFloat(oldValue);
        float newValueF=Float.parseFloat(newValue);
        
        switch (Operator) {
            case 1:
                 result=oldValueF/newValueF;
                break;
            case 2 :
                 result=oldValueF*newValueF;
                 break;
            case 3:
                 result=oldValueF+newValueF;
                break;
            case 4:
                result=oldValueF-newValueF;
               break;  
            
            default:
                break;
        }
        

        displayLabel.setText(result+"");
    }
    else if (e.getSource()==dotButton){
        if(isOperatorClicked){
            displayLabel.setText(".");
            isOperatorClicked=false;
          }
          else{
            displayLabel.setText(displayLabel.getText()+".");
          }
    }
    else if (e.getSource()==clearButton){
        displayLabel.setText("");
    }
    else if (e.getSource()==NegativeButton){
      if(isOperatorClicked){
          displayLabel.setText("-");
          isOperatorClicked=false;
        }
        else{
          displayLabel.setText(displayLabel.getText()+"-");
        }
  }
  else if (e.getSource()==DelButton){
   String string = displayLabel.getText();
   displayLabel.setText("");
   for(int i=0;i<string.length()-1;i++){
    displayLabel.setText(displayLabel.getText()+string.charAt(i));
   }
}
}

}