public class RequestData {
    String strNumber1;
    String strNumber2;


public RequestData() {
}

// Parameterized constructor
public RequestData(String strNumber1, String strNumber2) {
    this.strNumber1 = strNumber1;
    this.strNumber2 = strNumber2;
}

// Getter for strNumber1
public String getStrNumber1() {
    return strNumber1;
}

// Setter for strNumber1
public void setStrNumber1(String strNumber1) {
    this.strNumber1 = strNumber1;
}

// Getter for strNumber2
public String getStrNumber2() {
    return strNumber2;
}

// Setter for strNumber2
public void setStrNumber2(String strNumber2) {
    this.strNumber2 = strNumber2;
}

// toString method for easy representation
@Override
public String toString() {
    return "RequestData{" +
           "strNumber1='" + strNumber1 + '\'' +
           ", strNumber2='" + strNumber2 + '\'' +
           '}';
}
}