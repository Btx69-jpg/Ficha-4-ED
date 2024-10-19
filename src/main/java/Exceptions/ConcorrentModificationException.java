<<<<<<< HEAD
package Exceptions;public class ConcorrentModificationException {
=======
package Exceptions;

public class ConcorrentModificationException extends RuntimeException {
    public ConcorrentModificationException(String message) {
        super(message);
    }
>>>>>>> 6bca961 (fix push)
}
