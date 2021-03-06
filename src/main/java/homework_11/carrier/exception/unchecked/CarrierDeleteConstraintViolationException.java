package homework_11.carrier.exception.unchecked;

import homework_11.common.business.exception.unchecked.OurCompanyException;

public class CarrierDeleteConstraintViolationException extends OurCompanyException {

  private static final String MESSAGE = "Cant delete carrier with id '%s'. There are transportations which relates to it!";

  public CarrierDeleteConstraintViolationException(String message) {
    super(message);
  }

  public CarrierDeleteConstraintViolationException(long carrierId) {
    this(String.format(MESSAGE, carrierId));
  }
}
