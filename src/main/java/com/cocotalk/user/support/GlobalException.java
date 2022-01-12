package com.cocotalk.user.support;

import lombok.Getter;

@Getter
public class GlobalException extends RuntimeException {
    private final GlobalError error;

    public GlobalException(GlobalError error) {
        super(error.getDesc());
        this.error = error;
    }

    public GlobalException(GlobalError error, String message) {
        super(error.getDesc() + " : " + message);
        this.error = error;
    }

    public GlobalException(GlobalError error, Throwable cause) {
        super(error.getDesc(), cause);
        this.error = error;
    }
}
