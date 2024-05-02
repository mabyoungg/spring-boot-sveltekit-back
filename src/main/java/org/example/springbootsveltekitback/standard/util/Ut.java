package org.example.springbootsveltekitback.standard.util;

public class Ut {
    public static class cmd {

        public static void runAsync(String cmd) {
            new Thread(() -> {
                run(cmd);
            }).start();
        }

        public static void run(String cmd) {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder("bash", "-c", cmd);

                // windows
                // ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", cmd);

                Process process = processBuilder.start();

                // BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                // BufferedReader stderrReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                //
                // System.out.println("표준 출력:");
                // String line;
                // while ((line = stdoutReader.readLine()) != null) {
                //     System.out.println(line);
                // }
                //
                // System.out.println("표준 에러:");
                // while ((line = stderrReader.readLine()) != null) {
                //     System.out.println(line);
                // }

                process.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
