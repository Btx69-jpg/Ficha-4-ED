<<<<<<< HEAD
package PACKAGE_NAME;public class NotComparable {
}
=======
package CLASS;

import java.util.Random;
import java.util.UUID;

public class NotComparable {
    private int Id;
    private String name;
    private String surname;
    private String email;

    public NotComparable() {
        Random random = new Random();
        this.Id = random.nextInt();
        this.name = String.valueOf(UUID.randomUUID());
        this.surname = "Clebin";
    }
}
>>>>>>> 6bca961 (fix push)
