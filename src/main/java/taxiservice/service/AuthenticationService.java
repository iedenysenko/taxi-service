package taxiservice.service;

import taxiservice.lib.exception.AuthenticationException;
import taxiservice.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
