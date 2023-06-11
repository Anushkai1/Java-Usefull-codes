 public static void rxPhone(java.awt.event.KeyEvent evt) {                                    
        TxFld1 textFld = (TxFld1) evt.getSource();
        String st = textFld.getText();
               char d = evt.getKeyChar();
       int len = st.length();
        if(((len <10 && Character.isDigit(d) ) || (d==KeyEvent.CHAR_UNDEFINED  || d==KeyEvent.VK_BACK_SPACE || d==KeyEvent.VK_DELETE || d=='' || d=='' || d=='' || d==''))){
           // System.out.println(" *****");
            evt.consume();
        }
        int intg = -2;
        try{
            intg = Integer.parseInt(st);
        }catch(Exception e){}
      
        if(intg!=-2 && 400000000<intg && intg<800000000){
            textFld.setVldInput(true);//textFld.repaint();
        }else{
            textFld.setVldInput(false);//textFld.repaint();
        } 
    }  