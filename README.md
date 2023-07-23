# Project Changes Documentation

This README documents the changes made to the project according to parts C-J of the task.

## Part C - Customize the HTML User Interface

### File and Line Number:
- mainscreen.html: line 14 - 72,  77 - 79, 89, 91,94 - 95, 102 - 103, 112 - 113, 115, 121 - 128, 132, 134, 142, 157 - 162, 169 - 173.
- about.html: line 1 - 91.
- saveproductscreen.html: line 2, 5 - 37, 40 - 50.
- productForm.html: line 2, 5 - 116, 119 - 128, 130, 132, 136 - 142, 144, 146 - 169.
- OutsourcedPartForm.html: line 2, 5 - 149, 151 - 160, 162 - 167, 169 - 170, 172 - 173, 175, 177 - 178, 180 - 189, 191, 193 - 205.
- negativeerror.html: line 2, 5 - 43, 46 - 55.
- InhousePartForm.html: line 2, 5 - 148, 150 - 159, 161 - 169, 171 - 172, 174, 176 - 177, 179 - 188, 190, 192 - 205.
- confirmationdeleteproduct.html: line 2, 4 - 43, 46 - 55, 57 - 61.
- confirmationdeletepart.html: line 2, 4 - 37, 40 - 49, 51 - 55.
- confirmationassocpart.html: line 2, 4 - 37, 40 - 49, 51 - 55.
- confirmationaddproduct.html: line 2, 4 - 37, 40 - 49, 51 - 55.
- confirmationaddpart.html: line 2, 4 - 38, 41 - 50, 52 - 56.
  
### Change:
- Added CSS and button color for user-friendly interface.
- Added shop name, 
- Addedproduct names,
- Added Max and Min inventory columns.
- Added "Back to Product Form" button.
- Added pop-up modal for error message.

## Part D - Add an "About" Page

### File and Line Number:
- about.html: line 1 - 91.

### Change:
- Created an about page for the customer. Add navigation links.

## Part E - Add a Sample Inventory

### File and Line Number:
- BootStrapData.java: line 4, 16, 40 - 76.
- mainscreen.html: line 108 - 113, 153 - 156.

### Change:
- Added constructors to create instances of the InhousePart class.
- Imported the InhousePart class, service package, and set utility.
- Checked if the database is empty before adding sample data.
- Added sample data to the database.
- 

## Part F - Add a "Buy Now" Button

### File and Line Number:
- BuyNowController.java: line 1 - 33.
- mainscreen.html: line 159 - 161.

### Change:
- Added The “Buy Now” button between the update and delete products buttons.
- Added a new controller class called BuyNowController to handle the buy now functionality.
- Displayed a message to indicate the success or failure of a purchase.

## Part G - Track Maximum and Minimum Inventory

### File and Line Number:
- application.properties: line 6.
- Part.java: 4, 19, 24, 33 - 36, 46, 54, 59 - 60, 94 - 103.

### Change:
- Added additional fields to the part entity for maximum and minimum inventory.
- Modified the sample inventory to include the maximum and minimum fields.
- Added to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
- Renamed the file the persistent storage is saved to spring-boot-h2-db-Student_ID_*.
- Modified the code to enforce that the inventory is between or at the minimum and maximum value.
- 
## Part H - Add Validation for Maximum and Minimum Fields

### File and Line Number:
- ValidInventory.java: line 1 - 15.
- InventoryValidator.java: line 1 - 27.
- Part.java: 4, 19, 24, 33 - 36, 46, 54, 59 - 60, 94 - 103.
- AddProductController.java: line 30, 32 - 33, 59 - 68, 76, 89.

### Change:
- InventoryValidator.java validates the inventory of a Part object by checking if it falls within the specified minimum and maximum inventory limits.
- ValidInventory.java defines the ValidInventory annotation and specifies the InventoryValidator class as the validator for the annotation.
- Applied @Min annotation and declaration to min and max field.
- Made Part class non-abstract.
- Applied ValidInventory constraint to inventory field.
- Imported ValidInventory annotation.
- Added a setter and getter for the minimum and maximum inventory field.
- Added a constructor that takes the minimum and maximum inventory as parameters.

## Part I - Add Unit Tests for Maximum and Minimum Fields

### File and Line Number:
- PartTest.java: line 30 - 45.

### Change:
-  Added two unit tests for the maximum and minimum fields to the PartTest class in the test package.


## Part J - Remove Unused Validators

### File and Line Number:
- None.

### Change:
- No unused validators were found.


