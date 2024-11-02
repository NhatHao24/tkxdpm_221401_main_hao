public class AddUseCaseControl {

    // Fields
    private AddEntity addEntity;
    private AddUIConsoleOutput addUIConsoleOutput;

    // Constructor to initialize fields
    public AddUseCaseControl(AddEntity addEntity, AddUIConsoleOutput addUIConsoleOutput) {
        this.addEntity = addEntity;
        this.addUIConsoleOutput = addUIConsoleOutput;
    }

    // Method to execute the use case
    public void execute(RequestData requestData) {
        // Retrieve the numbers from RequestData
        String strNumber1 = requestData.getStrNumber1();
        String strNumber2 = requestData.getStrNumber2();

        // Validate the numbers
        if (isValidNumber(strNumber1) && isValidNumber(strNumber2)) {
            // Convert Strings to numbers
            int number1 = Integer.parseInt(strNumber1);
            int number2 = Integer.parseInt(strNumber2);

            // Send data to the entity
            // addEntity.add(number1, number2);

            // Provide feedback
            // addUIConsoleOutput.showMessage("Addition successful: " + (number1 + number2));
        } else {
            // Handle invalid input
            // addUIConsoleOutput.showMessage("Invalid input. Please enter valid numbers.");
        }
    }

    // Method to check if a string is a valid number
    private boolean isValidNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}