package in.definex.ChatSystem;

import in.definex.Bot;
import in.definex.Database.Core.ChatGroupDatabase;

import java.util.List;

/**
 * ChatGroupsManager
 * Manages the chat groups.
 *
 * Created by adam_ on 30-11-2017.
 */
public class ChatGroupsManager {

    /**
     * List of chatgroups
     */
    private List<ChatGroup> chatGroupList;

    public ChatGroupsManager() {
    }

    /**
     * Finds a group with id
     * @param id id of the group
     * @return ChatGroup object, return null if not found
     */
    public ChatGroup findGroupById(String id){
        for(ChatGroup chatGroup: chatGroupList){
            if(chatGroup.getGroupId().equals(id)){
                return chatGroup;
            }
        }
        return null;
    }

    /**
     * Loads the Chat Groups from the database to chatGroupList List
     */
    public void loadGroups(){
        this.chatGroupList = ChatGroupDatabase.getGroups(Bot.getFeatureManager(), Bot.getWebDriver());
    }

    /**
     * adds chatgroup to chatgroup list and saves it into the database
     * @param chatGroups
     */
    public void add(ChatGroup chatGroups){
        chatGroupList.add(chatGroups);
        ChatGroupDatabase.saveGroup(chatGroups);
    }

    /**
     * Removes the chatgroup from the database and manager.
     *
     * @param chatGroup chatgroup to remove
     */
    public void remove(ChatGroup chatGroup){
        chatGroupList.remove(chatGroup);
        ChatGroupDatabase.deleteChatGroup(chatGroup.getGroupId());
    }

    /**
     * @return chatGroupList
     */
    public List<ChatGroup> getChatGroupList() {
        return chatGroupList;
    }
}
