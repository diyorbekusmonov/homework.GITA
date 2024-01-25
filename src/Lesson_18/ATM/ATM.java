package Lesson_18.ATM;

import java.util.LinkedList;
import java.util.List;

public class ATM {
    Money money;
    private MessageInterface messageInterface = null;
    private ShowMoneyInfoInterface showMoneyInfoInterface = null;
    private List<Money> summ = new LinkedList<>();

    private boolean hasMessageListener() {
        return messageInterface != null;

    }

    private boolean hasMoneyListener() {
        return showMoneyInfoInterface != null;
    }

    public void setMessageListener(MessageInterface messageListener) {
        if (!hasMessageListener()) {
            this.messageInterface = messageListener;
        }
    }

    public void setShowMoneyInfoInterface(ShowMoneyInfoInterface moneyListener) {
        if (!hasMoneyListener()) {
            this.showMoneyInfoInterface = moneyListener;
        }
    }


    public void addMoneys(List<Money> moneys, boolean isMoneys) {
        summ.add((Money) moneys);
        if (isMoneys) {
            showMoneyInfoInterface.showMoneyData(money.getAmount(), money.getCount());
        }
        messageInterface.showMessage(moneys + "sum qo'shildi");
    }

}
