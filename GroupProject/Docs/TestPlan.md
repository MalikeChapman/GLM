# TestPlan

**Author**: \<Asher Chapman, Md Islam, Noureen Sandresy, Xingyu Zhang, Yaohui Chen\>

## 1 Testing Strategy

### 1.1 Overall strategy

* _Unit Testing (To be performed by Coder)_
    + The methods in the app's code will be tested, focusing on the tests that impact the behavior of the system.
    + A test showing the defect will be written before a defect is fixed, in case the defect was not properly fixed. 
    + All the paths through the unit will be tested. 
    + To ensure the performance of the code, the test cases will also be written. 
* _Integration Testing (To be performed by UI/UX and devOps)_
    + Before integration testing, each unit will be tested individually.
    + All or most of the units will be tested at one time. 
    + Testing will be done by following the design document which contains clear definitions of interactions between each unit. 
* _System Testing (To be performed by UI/UX and devOps)_
    + Testing will be performed after both of the Unit and Integration Testings.
    + The app will be tested as a whole.
* _Regression Testing (To be performed by Coder)_
    + Testing will be performed after any changes. 
    + All changes will need to be tested. 

### 1.2 Test Selection

The test cases will be selected depending on what level we are testing, such as Unit Testing, Integration Testing, System Testing, and Regression Testing. For the Integration Testing and System Testing, the black-box technique will be used for testing. For the Unit Testing and Regression Testing, the white-box technique will be used for testing. 

### 1.3 Adequacy Criterion

There are three test levels that we will be using for our models such as @test, @before and @after. To run our program, we will be performing a before-test by inputing different values. Let's imagine a scene. A customer is looking for a specific item. They search the item by typing its name. When our search function runs, it needs to catagorize it by letters. The first char of the input value will be used to look for all the item starting with that letter, then we move to the second letter and so on. This way we can narrow down our huge database into our desired item. Now, our before-test performance should know which item we are looking for, after we run our program, that function needs to find the exact item, otherwise there might be some sort of bug going on in our system. We will be running our bug-tracking system to determine where the error is and we need to discuss how we can solve the issue.

### 1.4 Bug Tracking

Android Studio and eclipse both provide fascinating debugging system. On eclipse, we can track each lines of codes that we may find confusing or buggy and test them to see if they compile. There could be both syntax error and symentic error. Syntax error will be red underlined by eclipse so we would be able to avoid that. Symentic error needs to have a little focus. The portion where we assume the problem might be needs to be marked and need to run through JVM in order to determine where the problem occurs. Both option such as step over and step into will be used to track down when the problem starts so that we can try to fix it in different ways and runs until we make sure there is no error.

### 1.5 Technology

JUnit would be the perfect choice for testing the technology. We are planning on creating different methods inside the different classes. These all will be linked up in the driver class where everything would be called with different input and to see if everything works. JUnit will use @test tag to detect which actions need to be performed. 

## 2 Test Cases

Test Case ID | Purpose | Precondition | Steps | Expected Result | Actual Result | Pass/Fail | Created By | Executed By
------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | ------------- | -------------
TC01 | Successful login to app. | 1. A valid user account to login. | 1. Open App.  <br> 2. Enter UserID. <br>  3. Enter password.  <br> 4. Click "Login".  | User is logged in successfully | N/A | N/A | Yaohui Chen | N/A
TC02 | Error message on unsuccessful login. | 1. A valid user name to login. | 1. Open app.  <br> 2. Enter UserID.  <br> 3. Enter password.  <br> 4. Click "Login". | Error message is displayed and user is not logged in. | N/A | N/A | Yaohui Chen | N/A
TC03 | Successful creation of a new list. | 1. App is open.  <br> 2. User is already logged in. | 1. Click "Create a new list" button on top of screen. <br>  2. Enter the name of the list.  <br> 3. Click "SUBMIT" when done. | User successfully creates a new list that user named. | N/A | N/A | Yaohui Chen | N/A
TC04 | Error message on attempting to create a new list with a list name already in use. | 1. App is open.  <br> 2. User is already logged in.  <br> 3. Lists are already created. | 1. Click “Create a new list” button on top of screen.  <br> 2. Enter the name of the exsiting list.  <br> 3. Click “SUBMIT” when done. | Error message is displayed and the user has not created a new list. | N/A | N/A | Yaohui Chen | N/A 
TC05 | Successful addition of an item to a list from the item database. | 1. App is open.  <br> 2. User is already logged in.  <br> 3. Lists are already created.  <br> 4. User selected a list.  <br> 5. Item exists in the database.  <br> 6. Item being added is not on the selected list. | 1. User searches item by the categories or type the item name in the space provided.  <br> 2. User selects the item from the item database. <br>  3. User enters quantity and clicks "Add". | Item with quantity is successfully added to the named list. | N/A | N/A | Yaohui Chen | N/A 
TC06 | Error message on attempting to add an item already on a list from the item database. | 1. App is open. <br>  2. User is already logged in.  <br> 3. Lists are already created.  <br> 4. User selected a list.  <br> 5. Item exists in the database.  <br> 6. Item being added is already on the selected list. | 1. User searches item by the categories or type the item name in the space provided.  <br> 2. User selects the item from the item database.  <br> 3. User enters quantity and clicks “Add”. | Error message is displayed and the item is not added. | N/A | N/A | Yaohui Chen | N/A 
TC07 | Successful deletion of an item from a list. | 1. App is open.  <br> 2. User is already logged in.  <br> 3. User selected a list. <br>  4. Item being deleted is on the selected list. | 1. User selects an item in the list to delete by clicking the check box to the left of the item.  <br> 2. User clicks on the trash icon at the top of the screen.  <br> 3. User confirms deleting. | The selected Item is successfully deleted from the selected list. | N/A | N/A | Yaohui Chen | N/A 
TC08 | Error message on attempting to delete an item from a list without selecting an item. | 1. App is open.  <br> 2. User is already logged in.  <br> 3. User selected a list. | 1. User clicks on the trash icon  without selecting a item at the top of the screen. | Error message is displayed and no deletion occurs. | N/A | N/A | Yaohui Chen | N/A 
TC09 | Successful update to an item's quantity. | 1. App is open. <br> 2. User is already logged in. <br> 3. User selected a list. <br> 4. User has items on the list. | 1. User selects an item in the list. <br> 2. User enters quantity amount in the space provided and clicks "OK". | The quantity of the selected item in the list has updated. | N/A | N/A | Yaohui Chen | N/A 
TC10 | Successful item check-off in a list. | 1. App is open. <br> 2. User is already logged in. <br> 3. User selected a list. <br> 4. User has items on the list. <br> 5. Box next to item to be checked-off is empty. | 1. User clicks on an empty box next to an item. |  Check-off mark appears in the box next to the item in the list. | N/A | N/A | Yaohui Chen | N/A 
TC11 | Successfully clear one check-off mark from a list. | 1. App is open. <br> 2. User is already logged in. <br> 3. User selected a list. <br> 4. User has items on the list. <br> 5. Box next to item  has a check-off mark. | 1. User clicks on a box with a check-off mark. | Check-off mark is cleared next to item and the box is now empty. | N/A | N/A | Yaohui Chen | N/A 
TC12 | Successfully clear all check-off marks from a list at once. | 1. App is open. <br> 2. User is already logged in. <br> 3. User selected a list. <br> 4. User has items on the list. <br> 5. One or more items are checked-off. | 1. User clicks on the Menu button and selects "ClearCheck". | All check-off marks have been cleared and the items still remain in the list. | N/A | N/A | Yaohui Chen | N/A 
TC13 | The “Create a new list” button on top of screen successfully brings user to "Add New List" interface. | 1. App is open. | 1. Click “Create a new list” button on top of screen. | User is brought to "Add New List" interface. | N/A | N/A | Yaohui Chen | N/A 
TC14 | Successful deletion of a list. | 1. App is open. <br> 2. User is already logged in. <br> 3. User has created one or more lists. | 1. User chooses a list or lists to delete by clicking on empty check box to the left of list name. <br> 2. User clicks on trash icon. <br> 3. User confirms list(s) deletion by clicking "OK". | The selected Lists are successfully deleted. | N/A | N/A | Yaohui Chen | N/A 
TC15 | Back button successfully brings user to the previous interface. | 1. App is open. <br> 2. User is already logged in. <br> 3. User have created a list. <br> 4. User selected a list. | 1. Click the back arrow. | User is brought back to the previous screen (ListView). | N/A | N/A | Yaohui Chen | N/A 
TC16 | Cancel button successfully cancels user's action. | 1. App is open. <br> 2. User is already logged in.  <br> 3. User has created a list. <br> 4. User performs an action requiring confirmation such as list deletion.| 1. User clicks "CANCEL". | Deletion does not occur. | N/A | N/A | Yaohui Chen | N/A 
TC17 | Lists and items are successfully saved to app after exiting. | 1. App is open. <br> 2. User is already logged in.  <br> 3. New lists and items have been created. | 1. Exit the App. <br> 2. Open the App. | The items are still in the lists. | N/A | N/A | Yaohui Chen | N/A 
TC18 | Clicking an item type successfully opens a list of items of that type. | 1. App is open. <br> 2. User is already logged in. <br> 3. Database exists with items and item types. <br> 4. User runs a search. | 1. User clicks an item type. |  Items of the selected type are shown. | N/A | N/A | Yaohui Chen | N/A 
TC19 | Error message on attempting to search for an item without entering an input. | 1. App is open. <br> 2. User is already logged in. <br> 3. A list is created and selected. | 1. User clicks on the search icon. <br> 2. User clicks "SEARCH" without an input. | Error message is displayed. | N/A | N/A | Yaohui Chen | N/A 
TC20 | Item quantity only accepts integer input. | 1. App is open. <br> 2. User is already logged in. <br> 3. A list is created and selected. | 1. User clicks on an item inside a list. <br> 2. User inputs something other than integers. | App restricts the input. | N/A | N/A | Yaohui Chen | N/A 
TC21 | App successfully restricts usage of special characters or capital letters in list and item names. | 1. App is open. <br> 2. User is already logged in. <br> 3. User performs an action requiring input. | 1. User types input in space provided with special characters or capital letters. | App restricts the input. | N/A | N/A | Yaohui Chen | N/A 