package com.sino.daily.code_2019_6_25;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created on 2019/6/25 9:35.
 *
 * @author caogu
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Long> errorStatistics = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String inLine = scanner.nextLine();
            if (inLine == null || "".equals(inLine)) {
                break;
            }

            String[] inLineWords = inLine.split(" ");
            String fileFullName = inLineWords[0];

            String fileName = fileFullName.substring(fileFullName.lastIndexOf("\\") + 1);
            String fileValidName = fileName.length() > 16 ?
                    fileName.substring(fileName.length() - 16) : fileName;

            String key = fileValidName + "-" + inLineWords[1];
            errorStatistics.put(key, errorStatistics.getOrDefault(key, 0L) + 1);
        }

        int count = 0;
        for (Map.Entry<String, Long> entry : errorStatistics.entrySet()) {
            count++;
            String k = entry.getKey();
            Long v = entry.getValue();

            if (errorStatistics.size() <= 8
                    || count > errorStatistics.size() - 8) {
                System.out.println(k.split("-")[0] + " " + k.split("-")[1] + " " + v);
            }
        }
    }
}
