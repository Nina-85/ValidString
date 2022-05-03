# Factory Design Pattern

Factory Design Pattern является одним из наиболее часто используемых шаблонов проектирования. Он относится к категории Creational Design Pattern.

В Factory Design Pattern мы создаем объект из factory class, не показывая логику создания клиенту. Объекты будут создаваться интерфейсом или абстрактным классом. 
Тип объекта будет одним из подклассов, и он будет зависеть от входных данных, которые мы передаем в фабрику.

Основным преимуществом Factory Design Pattern является то, что она обеспечивает loose-coupling.
Factory Design Pattern применяется, когда нужно обеспечить высокий уровень гибкости кода.

Примеры, где используется Factory Design Pattern:
- Calendar.getInstance()
- NumberFormat.getInstance()
- Все классы-оболочки, такие как Integer, Boolean и т. д., в Java используют этот шаблон для оценки значений с использованием метода valueOf()
