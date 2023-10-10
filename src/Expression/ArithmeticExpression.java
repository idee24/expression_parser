package Expression;

import Context.Environnement;
import Context.StatusCode;
import Exception.SyntaxError;
import Exception.VariableNotExistError;

public abstract class ArithmeticExpression {
    protected ArithmeticExpression() {
    }

    /**
     * @brief       This method parse an expression and return a StatusCode
     * @param   env The environnement that contains the expression to parse
     * @return      A StatusCode that represent the result of the evaluation
     */
    public abstract StatusCode parse(Environnement env) throws SyntaxError;

    /**
     * @brief       This method evaluate the value stored after parsing
     * @return      The result of the expression
     */
    public abstract Double evaluate() throws VariableNotExistError;
}
