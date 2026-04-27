package ch10.exception.ex04;

import ch10.exception.ex04.NetworkClientException;

public class SendException extends NetworkClientException {
    private final String sendData;

    public SendException(String sendData, String message) {
        super(message);
        this.sendData=sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
