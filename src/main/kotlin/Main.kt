fun main() {

    // Map storing item names and their earnings
    val items = mapOf(
        "Bubblegum" to 202,
        "Toffee" to 118,
        "Ice cream" to 2250,
        "Milk chocolate" to 1680,
        "Doughnut" to 1075,
        "Pancake" to 80
    )

    // Print heading
    println("Earned amount:")

    // Loop through each item and print its name and earnings
    for (item in items) {
        println("${item.key}: $${item.value}")
    }

    // Calculate total income by summing all values
    val grossIncome = items.values.sum()

    // Print total income
    println("\nIncome: $$grossIncome")

    // Take staff expenses input from user
    println("Staff expenses:")
    val staffExpenses = readln().toInt()

    // Take other expenses input from user
    println("Other expenses:")
    val otherExpenses = readln().toInt()

    // Calculate total expenses
    val totalExpenses = staffExpenses + otherExpenses

    // Calculate net income
    val netIncome = grossIncome - totalExpenses

    // Print final net income
    println("Net income: $$netIncome")
}