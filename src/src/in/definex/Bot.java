package in.definex;

import in.definex.Action.ActionManager;
import in.definex.Action.Checker;
import in.definex.Action.RemoteActionCall;
import in.definex.ChatSystem.ChatGroupsManager;
import in.definex.ChatSystem.ChatProcessor;
import in.definex.ChatSystem.ChatProcessorManager;
import in.definex.Console.Console;
import in.definex.Database.Configuration;
import in.definex.Database.DatabaseManager;
import in.definex.Feature.FeatureManager;
import in.definex.NetworkJob.NetworkJobManager;
import in.definex.Scheduler.ScheduleManager;
import org.openqa.selenium.WebDriver;

/**
 * Wrapper class for all the manager class in the bot,
 * can access the managers by using the static getter functions
 *
 *
 * Created by adam_ on 03-04-2018.
 */
public class Bot {

    private static Bot me;

    /**
     * Selenium Web Driver
     * Used to get web elements from the whatsapp web application
     */
    private WebDriver webDriver;

    /**
     * Go to the class to read their description
     */
    private ActionManager actionManager;
    private Checker checker;
    private FeatureManager featureManager;
    private Console console;
    private ChatGroupsManager chatGroupsManager;
    private Looper looper;
    private DatabaseManager databaseManager;
    private Configuration configuration;
    private ChatProcessorManager chatProcessorManager;
    private RemoteActionCall remoteActionCall;
    private ScheduleManager scheduleManager;
    private NetworkJobManager networkJobManager;

    static void CreateBot(WebDriver webDriver,
                          ActionManager actionManager,
                          Checker checker,
                          FeatureManager featureManager,
                          ChatProcessorManager chatProcessorManager,
                          Console console,
                          ChatGroupsManager chatGroupsManager,
                          Looper looper,
                          DatabaseManager databaseManager,
                          Configuration configuration,
                          RemoteActionCall remoteActionCall,
                          ScheduleManager scheduleManager,
                          NetworkJobManager networkJobManager
    ) {
        me = new Bot();

        me.webDriver = webDriver;
        me.actionManager = actionManager;
        me.checker = checker;
        me.featureManager = featureManager;
        me.chatProcessorManager = chatProcessorManager;
        me.console = console;
        me.chatGroupsManager = chatGroupsManager;
        me.looper = looper;
        me.configuration = configuration;
        me.databaseManager = databaseManager;
        me.remoteActionCall = remoteActionCall;
        me.scheduleManager = scheduleManager;
        me.networkJobManager = networkJobManager;
    }

    public static WebDriver getWebDriver() {
        return me.webDriver;
    }

    public static ActionManager getActionManager() {
        return me.actionManager;
    }

    public static Checker getChecker() {
        return me.checker;
    }

    public static ChatProcessorManager getChatProcessorManager(){
        return me.chatProcessorManager;
    }

    public static FeatureManager getFeatureManager() {
        return me.featureManager;
    }

    public static Console getConsole() {
        return me.console;
    }

    public static ChatGroupsManager getChatGroupsManager() {
        return me.chatGroupsManager;
    }

    public static Looper getLooper() {
        return me.looper;
    }

    public static Configuration getConfiguration() {
        return me.configuration;
    }

    public static DatabaseManager getDatabaseManager() {
        return me.databaseManager;
    }

    public static RemoteActionCall getRemoteActionCall() {
        return me.remoteActionCall;
    }

    public static ScheduleManager getScheduleManager() { return me.scheduleManager;}

    public static String getProjectLoc() {
        return System.getProperty("user.dir");
    }

    public static NetworkJobManager getNetworkJobManager() {
        return me.networkJobManager;
    }

}
