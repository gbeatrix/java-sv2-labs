package statemachine.seatheater;

public enum SeatHeaterState {
    OFF {
        @Override
        SeatHeaterState next() {
            return THREE;
        }
    },
    THREE {
        @Override
        SeatHeaterState next() {
            return TWO;
        }
    },
    TWO {
        @Override
        SeatHeaterState next() {
            return ONE;
        }
    },
    ONE {
        @Override
        SeatHeaterState next() {
            return OFF;
        }
    };

    abstract SeatHeaterState next();
}
