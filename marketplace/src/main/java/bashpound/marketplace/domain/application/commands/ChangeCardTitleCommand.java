package bashpound.marketplace.domain.application.commands;

import bashpound.marketplace.domain.model.card.CardId;

public class ChangeCardTitleCommand extends UserCommand {

  private CardId cardId;
  private String title;

  public ChangeCardTitleCommand(CardId cardId, String title) {
    this.cardId = cardId;
    this.title = title;
  }

  public CardId getCardId() {
    return cardId;
  }

  public String getTitle() {
    return title;
  }
}
