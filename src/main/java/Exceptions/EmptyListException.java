<<<<<<< HEAD
package Exceptions;public class EmptyListException {
=======
package Exceptions;

public class EmptyListException extends RuntimeException{
    public EmptyListException(String message) {
        super(message);
    }
>>>>>>> 6bca961 (fix push)
}
