package bashpound.marketplace.domain.application.commands;

import org.springframework.util.Assert;

import java.util.Objects;

public class RegisterCommand extends AnonymousCommand {

  private String username;
  private String emailAddress;
  private String password;
  private String firstName;
  private String lastName;

  public RegisterCommand(String username, String emailAddress, String password, String firstName, String lastName) {
    Assert.hasText(username, "Parameter `username` must not be empty");
    Assert.hasText(emailAddress, "Parameter `emailAddress` must not be empty");
    Assert.hasText(password, "Parameter `password` must not be empty");
    Assert.hasText(firstName, "Parameter `firatName` must not be empty");
    Assert.hasText(lastName, "Parameter `lastName` must not be empty");

    this.username = username;
    this.emailAddress = emailAddress;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getUsername() {
    return this.username;
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public String getPassword() {
    return this.password;
  }
  

  public String getFirstName() {
	return firstName;
}

public String getLastName() {
	return lastName;
}

@Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof RegisterCommand)) return false;
    RegisterCommand that = (RegisterCommand) o;
    return Objects.equals(username, that.username) &&
      Objects.equals(emailAddress, that.emailAddress) &&
      Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, emailAddress, password);
  }

  @Override
  public String toString() {
    return "RegisterCommand{" +
      "username='" + username + '\'' +
      ", emailAddress='" + emailAddress + '\'' +
      ", password='" + password + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      '}';
  }
}
