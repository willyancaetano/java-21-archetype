#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.logging.Logger;

public class HelloWorld {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(HelloWorld.class.getName());
        logger.info("This is a module-using Hello World!");
    }
}
