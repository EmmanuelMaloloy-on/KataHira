package ths.learnjp.katahira;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Global {
    public static Map language;
    public static String language_name;
    public static Map chara_set;
    public static String chara_set_name;
    public static Map session_set;
    public static Map score_session_set = new HashMap();
    public static String selectedProfile, rank, dateTimeNow, syllabary, latestTime;
    public static int selectedProfileId, total_session, session_attempts_left, session_mistake, session_score;
    public static boolean startTimer = false;
    public static double time = 0.0;
    public static ArrayList<String> wrongChars = new ArrayList<>();
}
