package com.company;

import java.io.*;
public class HideFile {
    private static void setHiddenAttrib(File file) {
        try {
            // execute attrib command to set hide attribute
            Process p = Runtime.getRuntime().exec("attrib +H " + file.getPath());
            // for removing hide attribute
            //Process p = Runtime.getRuntime().exec("attrib -H " + file.getPath());
            p.waitFor();
            if(file.isHidden()) {
                System.out.println(file.getName() + " hidden attribute is set to true");
            }else {
                System.out.println(file.getName() + " hidden attribute not set to true");
            }
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

