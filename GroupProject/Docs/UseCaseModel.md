# Use Case Model

**Author**: \<Team 6\>

## 1 Use Case Diagram


![](https://i.imgur.com/1G0yEJt.jpg)


## 2 Use Case Descriptions



**1. Search for an item by name**
    -Allows the user to search for an item by typing in the name. Each item that has part of that name in the database will be returned.
    -In order to do this, the user needs to be logged into their account.
    -When the user searchs, if the name corresponds to an item in the database, it must be returned.
    -User searches for apple, in return we may receive items like apple slices, green apples, yellow apples, red apples, etc...

**2. Browse for item by category**
    -Allows the user to search for an item in the database by category. The categories will be split into food and non food items. To browse each category, the user must click on the category they want.
    -In order to search for an item by category, the user needs to be logged into their account.
    -When a category is pressed by the user, the category will then bring a list of items belonging in that category.
    -User logs in. When the user logs in , he will click on either food item or non food item. When the user clicks on food item, he willl see the different categories like fruits or veggies, or pasta. When the user presses on any of these categories, the list of items beloning in that category will be shown.
    
**3. Add item**
    -When a user wants to add an item to their personal list or add a new item to the database. They can specify the quantity of the item and add it to their personal lists. In an event that the item isn't in the databse, the user has the option of adding the item into the database.
    -The user needs to be logged in. The user has to have searched for the item by name or browse for the item by category. 
    -After adding the item, the item will need to be in the user's grocery list if they wanted to add it to their list. Or, in the event that the item isn't in the databse, an option to add the item to the database will be given to the user.
    
**4. Login**
    -Allows the user to login to their profile. When the user logs in, they will be able to see what lists they have. They will also be able to modify, delete, or add items to their list.
    -User has to add the matching username and password corresponding to their accounts.
    -Once the accepted login credentials are used, the user will then be guided to the main menu, where they can either search for items or modify their lists.
    -User enters correct account credentials. User is then taken to a new screen where the user can browse the database for items. 
    
**5. Sign out**
    -Allows the user to sign out of their account which will take them to the login screen afterwards.
    -The user needs to be in the profile tab to sign out, or signs out by pressing the sign out button in the navigation bar.
    -Once the user presses the sign outbutton, they will taken to the login screen.
    -User presses the sign out button in the navigation bar, screen transitions into the login screen.
    
**6. Modify List**
    -Allows the user to modify the items in the list by either removing the item or changing the quantity of that item in the list.
    -User will need to be logged in. The user will need to be in the profile tab in the list section. The user can then click on the list to modify it.
    -Once the user changes the item in the list, it should be automatically saved and updated afterwards. 
    -User goes to profile tab. User clicks on the list from the list section. A list of items from the list will be displayed. The user will then modify the item they wish to modify.
    
**7. View List**
    -Allows the user to view all the lists the user currently has.
    -The user will need to be logged in and in the profile section of the app. The user will need to click on the list section and within that section all lists will be displayed.
    -After the user finished viewing the lists, the fragment will then be closed.
    
**8. Delete List**
    -The user will be able to delete the selected list from the list of userlists.
    -The logged in user will be able to go to the profile tab and delete the selected lists.
    -After the list is deleted the user list will be saved and updated to reflect the changes.
    
**9. Rename List**
    -The user will be able to rename the list to a different name.
    -The user will need to be logged in in order for the list to be renamed. The user also has to be in the profile section.
    -After the user changes the name the list name should reflact what the new name should be.
    
**10. Remove item**
    -When a user wants to modify the list, they will get an option to remove an item.
    -The user will have to be logged in. The user will ahve to navigate to the profile tab and list section. The user will then have to select the list they want the item removed from.
    -When the user removes the item, it will have to be updated to reflect the item being removed. The list will have to be saved afterwards.
    -User logs in. User will then navigate to the profile tab from the navigation bar. The user will then have to select the list that the item is currently in. After selecting the list, the user will select the item to be removed.