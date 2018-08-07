using System;
using CalculatorApp.Models;
using Microsoft.AspNetCore.Mvc;

namespace CalculatorApp.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet]
        public ActionResult Index(Calculator calculator)
        {
            return View(calculator);
        }

        [HttpPost]
        public ActionResult Calculate(Calculator calculator)
        {
            calculator.Result = CalculateResult(calculator);

            return RedirectToAction("Index", calculator);
        }

        private decimal CalculateResult(Calculator calculator)
        {
            switch (calculator.Operator)
            {
                case "+":
                    return calculator.LeftOperand + calculator.RightOperand;

                case "-":
                    return calculator.LeftOperand - calculator.RightOperand;

                case "*":
                    return calculator.LeftOperand * calculator.RightOperand;

                case "/":
                    return calculator.LeftOperand / calculator.RightOperand;

                case "%":
                    return calculator.LeftOperand % calculator.RightOperand;

                case "^":

                    var result = 1m;

                    for (var index = 0; index < calculator.RightOperand; index++)
                    {
                        result *= calculator.LeftOperand;
                    }

                    return result;
                default:
                    return 0;
            }

        }
    }
}
