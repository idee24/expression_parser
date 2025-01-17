package Expression.Minimal;

import Context.Environnement;
import Context.StatusCode;
import Exception.SyntaxError;
import Exception.VariableNotExistError;

public class NumberExpression extends MinimalExpression {
    Double value;

    public NumberExpression() {
        this.value = 0.0;
    }

    public NumberExpression(Double value) {
        this.value = value;
    }

    public StringBuilder toStringBuilder() {
        return new StringBuilder(this.value.toString());
    }

    @Override
    public Double evaluate() throws VariableNotExistError {
        return Double.valueOf(this.value);
    }

    @Override
    public StatusCode parse(Environnement env) throws SyntaxError {
        try {
            this.value = Double.valueOf(env.getExpression());
        } catch (NumberFormatException e) {
            return StatusCode.FAILURE;
        }
        return StatusCode.SUCCESS;
    }
}
