package utils;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

import java.math.BigInteger;

public class JurassicValidator extends FieldValidatorSupport {
    @Override
    public void validate(Object object) throws ValidationException {
        String fieldName = this.getFieldName();
        Object fieldValue = this.getFieldValue(fieldName, object);
        if (fieldValue instanceof BigInteger) {
            BigInteger jurassic = (BigInteger) fieldValue;
            if (jurassic.longValue() < 1000*1000*1000*10) {
                this.addFieldError(fieldName, object);
            }
        }
    }
}
