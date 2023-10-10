package Expression.Minimal;

import Context.Environnement;
import Context.StatusCode;
import Exception.SyntaxError;
import Exception.VariableNotExistError;

public class NumberExpression extends MinimalExpression {
    Integer value;

    public NumberExpression() {
        this.value = 0;
    }

    public NumberExpression(Integer value) {
        this.value = value;
    }

    public String toString() {
        return value.toString();
    }

    @Override
    public Double evaluate() throws VariableNotExistError {
        return Double.valueOf(this.value);
    }

    @Override
    public StatusCode parse(Environnement env) throws SyntaxError {
        try {
            this.value = Integer.parseInt(env.getExpression());
        } catch (NumberFormatException e) {
            return StatusCode.FAILURE;
        }
        return StatusCode.SUCCESS;
    }
}
