package statemachine.typewriter;

public enum TypeWriterState {
    UPPERCASE {
        TypeWriterState next() {
            return LOWERCASE;
        }
    },
    LOWERCASE {
        TypeWriterState next() {
            return UPPERCASE;
        }
    };

    abstract TypeWriterState next();
}
