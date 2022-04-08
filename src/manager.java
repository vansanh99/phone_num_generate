/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vansa
 */
public class manager {

//    private static final String phoneNumber = "(09|03|07|08|05|012|018|016|019)([0-9]{8})";
    int count = 0;
    double size;
    double size1;
    double size2;
    double size3;
    double size4;

    public void writeDataAtOnce(String path) {
//        String phone;
        File data = new File(path + "\\dict03.txt");
        File data1 = new File(path + "\\dict08.txt");
        File data2 = new File(path + "\\dict07.txt");
        File data3 = new File(path + "\\dict09.txt");
        File data4 = new File(path + "\\dict05.txt");

        try {
            try (FileWriter outdata = new FileWriter(data, true)) {
                for (int i = 320000000; i <= 399999999; i++) {
//                    phone = Integer.toString(i);
                    outdata.append("0" + i + "\n");
                    count++;
//                    if (phone.matches(phoneNumber)) {
//                        outdata.append("0" +phone + "\n");
//                    }
                }

                outdata.flush();
                double bytes = data.length();
                size = bytes / 1024 / 1024;
            }
            try (FileWriter outdata = new FileWriter(data1, true)) {
                for (int i = 810000000; i <= 869999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                for (int i = 880000000; i <= 899999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                outdata.flush();
                double bytes = data1.length();
                size1 = bytes / 1024 / 1024;
            }
            try (FileWriter outdata = new FileWriter(data2, true)) {

                for (int i = 760000000; i <= 799999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                for (int i = 700000000; i <= 709999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                outdata.flush();
                double bytes = data2.length();
                size2 = bytes / 1024 / 1024;
            }
            try (FileWriter outdata = new FileWriter(data3, true)) {
                for (int i = 900000000; i <= 949999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                for (int i = 960000000; i <= 989999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                outdata.flush();
                double bytes = data3.length();
                size3 = bytes / 1024 / 1024;
            }
            try (FileWriter outdata = new FileWriter(data4, true)) {
                for (int i = 560000000; i <= 569999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                for (int i = 580000000; i <= 589999999; i++) {
                    outdata.append("0" + i + "\n");
                    count++;
                }
                outdata.flush();
                double bytes = data4.length();
                size4 = bytes / 1024 / 1024;
            }
        } catch (IOException ex) {
            Logger.getLogger(manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getCount() {
        return count;
    }

    public double getSize() {
        return size;
    }

    public double getSize1() {
        return size1;
    }

    public double getSize2() {
        return size2;
    }

    public double getSize3() {
        return size3;
    }
    public double getSize4() {
        return size3;
    }
}
