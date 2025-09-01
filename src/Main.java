public class Main {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder(
                    "java", "-jar", "ViaProxy.jar", "config", "viaproxy.yml"
            );
            pb.inheritIO(); // Optional: shows output in your console
            Process process = pb.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}