📁 com.utils/module-info.java

module com.utils {
    exports com.utils;
}

📁 com/utils/Utils.java

package com.utils;

public class Utils {
    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Java Modules.";
    }
}

📁 com.greetings/module-info.java

module com.greetings {
    requires com.utils;
}

📁 com/greetings/Main.java

package com.greetings;

import com.utils.Utils;

public class Main {
    public static void main(String[] args) {
        String message = Utils.greet("Asritha");
        System.out.println(message);
    }
}
✅ Compilation and Running (Command Line)
1. Compile both modules

javac -d out/com.utils com.utils/module-info.java com/utils/Utils.java
javac --module-path out -d out/com.greetings com.greetings/module-info.java com/greetings/Main.java
2. Run the com.greetings module

java --module-path out -m com.greetings/com.greetings.Main