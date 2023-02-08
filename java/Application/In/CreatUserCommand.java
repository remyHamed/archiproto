package Application.In;

import java.util.Objects;

public class CreatUserCommand {
}


public final class CreateAccountCommand {

    public final Money initialMoney;

    public CreateAccountCommand(Money initialMoney) {
        this.initialMoney = Objects.requireNonNull(initialMoney);
    }
}