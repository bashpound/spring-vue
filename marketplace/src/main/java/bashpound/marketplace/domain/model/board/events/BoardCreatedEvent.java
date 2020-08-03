package bashpound.marketplace.domain.model.board.events;

import bashpound.marketplace.domain.common.event.TriggeredBy;
import bashpound.marketplace.domain.model.board.Board;

public class BoardCreatedEvent extends BoardDomainEvent {

  private static final long serialVersionUID = 533290197204620246L;

  private String boardName;

  public BoardCreatedEvent(Board board, TriggeredBy triggeredBy) {
    super(board.getId(), triggeredBy);
    this.boardName = board.getName();
  }

  public String getBoardName() {
    return boardName;
  }

  @Override
  public String toString() {
    return "BoardCreatedEvent{" +
      "boardId=" + getBoardId() +
      ", boardName='" + boardName + '\'' +
      '}';
  }
}
