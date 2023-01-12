# JSP-Servlet-JDBC-Project

A very basic Java Web Application.

The implementation was done on **Eclipse IDE** using **JSP, Spring and Hibernate.** The database is implemented in **MySQL.**

The web application runs on localhost using **Tomcat 9.0.**

The function is: 

1. A **"Homepage"** that consists of two buttons. **"Register New User"** redirects to a registration form page and **"Display Users"** redirects to a user list page.
2. A **"Register New User"** page that is comprised of a Registration Form including **First Name (textfield, mandatory), Surname (textfield, mandatory), Gender (drop down list, mandatory) and Date of Birth (datepicker, mandatory)** as well as **Work Address (textarea, non-mandatory) and Home Address (textarea, non-mandatory).** Below the form lies a submit button which sends the data into the MySQL database and then redirects to a **"Successful Registration Page"** and a "Back to Home" button which returns the user to the Homepage.
3. The **"Successful Registration Page"** that consists only of the message "User successfully registered!" on screen and a similar "Back to Home" button as the Registration Form.
4. The **"Display Users"** page is getting the entries from the MySQL database but listing only the first name and the surname of each entry in a table. In each table row there is a "See more" button which, when clicked, opens a new tab with the full info of the user of that row. There is also a search bar above the list, which when promted to search via clicking of the "Search" button shows all entries that include the string in the search bar on their first name or surname column. The "Reset List" button next to the searchbar just resets the page to include the whole list again.
5. The **"User Details"** page is simply the tab that opens from the clicking of the "See More" buttong on any of the **"Display Users"** page table rows and provides all the information of that given row (first name, surname, gender, date of birth, work address and home address). 

All the above pages are implemented by individual JSP files in the source code.
