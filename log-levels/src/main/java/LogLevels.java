public class LogLevels {
    public static String message(String logLine) {
        int indice = logLine.indexOf(" ");
        String line = logLine.substring(indice);
        String trueLine = line.trim();
        return trueLine; 
    }
    public static String logLevel(String logLine) {
        if(logLine.contains("ERROR")){
            return "error";
        }else if(logLine.contains("WARNING")){
            return "warning";
        }else{
            return "info";
        }
    }
    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
