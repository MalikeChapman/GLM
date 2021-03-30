# Project Plan


**Author**: \<Team 6>

## 1 Introduction

This application will be used to manage a user's grocery list by being able to create lists of grocery items by selecting these items from a store's database.

## 2 Process Description



**1. Activity_Login**
        - With this activity we will have the user login to their profile in order for them to be able to use the databse. 
        - When the app starts up, this screen will be the first screen a user sees every time if they are not logged in. If a user is logged in already, this screen will be bypassed and we will see the activity_category first.
        - The exit criteria fpr this activity will be after the user inputs the correct username and password. After the correct inputs are accepted the app will then transition to the item activity.
        
**2. Activity_Category**
        - With this activity, the user will be able to browse the database of items and choose the category between food and nonfood to see the items in the category. Also, the user will be able to select items from a category which will take them to activty_item. The user will also be able to search for items by the item's name instead of browsing through the categories.
        - The entrance criteria for this activity will be if the user is already signed in when the app starts up. The other criteria will be when the category tab in the navigation bar is pressed, we will be directed to this activity.
        - To exit this activity, you can either switch tabs in the navigation bar or just close down the app. 
        
**3. Activity_Profile**
        - With this activity, the user will be able to change their username and password. The user will also be able to access their lists from this activity. The user will also be able to sign out from their profile on this page. This activity will also show which items were added to which lists. 
        -  To enter this activity, the user will have to click on the profile tab that will be at the bottom of the page. The profile tab will be apart of a navigation bar.This navigation bar will be how the user traverses through the different screens.
        - To exit this activity, the user can either sign out of their profile, which in turn will take them back to the login screen, or they can click on one of the different tabs at the bottom in the navigation bar.


**4. Activity_Item**
        - With this activity, the user will be able to modify the item's price, quantity, description. The user can also add this item to their list from this activity. If the item is not found within the databse, the item will  be added to the database by the user.
        - The user can enter this activity by selecting a category or by searching for the item in the search bar.
        -  The user can exit this activity by using the navigation bar to navigate to a different activity.
        
**5. Activity_All_NonFoodCategories**
        - This activity will contain a list of all non food categories.
        - To enter this activity, the user will have to click on the non food item category from the Activity_Category.
        - The user can exit this activity by using the navigation bar to navigate to a different activity.


**6. Activity_All_
FoodCategories**
        - This activity will contain a list of all food categories.
        - To enter this activity, the user will have to click on the food item category from the Activity_Category.
        - The user can exit this activity by using the navigation bar to navigate to a different activity.
        
## 3 Team



  - Asher Chapman
  - Noureen Sandresy
  - Yaohui Chen
  - Md Islam
  - Xingyu Zhang

**Roles**
1. Coder - will implement class diagrams into Java code.
2. Designer - will implement UML class diagrams and use case models to design the flow of the app.
3. Documenter - will make note of what each specifications have been imnplemented.
4. UI/UX - will be in charge of implementing the visual look of the application.
5. devOps - will be in charge of testing the app functionality and discovering bugs within the app so that it can work as intended.




| Asher | Noureen | Yaohui   | Md    |  Xingyu   |
| ----- | ------- | ---- | --- | --- |
| 1, 3, 5  | 2, 4    | 1, 5 |  1, 3 |  4   |