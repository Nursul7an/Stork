package delivery.stork.exception;

public class InvalidDataException extends RuntimeException{
    public InvalidDataException(){}
    public InvalidDataException(String message){
        super(message);
    }
}
