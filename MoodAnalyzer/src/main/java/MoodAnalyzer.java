public class MoodAnalyzer {

    public String analyzeMood(String msg) {
        if(msg.contains("Sad")){
            return "Sad";
        }
        return "Happy";
    }
}
