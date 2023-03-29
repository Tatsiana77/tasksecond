# TASK SHAPES PART II

*Необходимо разработать приложение и тесты к нему согласно требованиям, приведенным ниже. В приложении должна быть реализована функциональность, 
определенная индивидуальным заданием.*<br/>

*Develop an application and tests for it according to the requirements given below. The application must implement 
the functionality defined by the individual task.*<br/>

## Requirements

➢ Все созданные объекты геометрических фигур сохранить в объекте-репозитории. Паттерн Repository.<br/>
➢ Разработать спецификации по поиску объектов и групп объектов в репозитории. По ID, по имени, по координатам (например: найти все объекты точки которых находятся в первом квадранте, найти все объекты площади поверхности (объемы, периметры) которых заключены в заданный диапазон, найти объекты находящиеся на расстоянии в заданном диапазоне от начала координат)
➢ Разработать методы по добавлению, удалению объектов репозитория.<br/>
Разработать методы сортировки наборов объектов по ID, по имени, по координатам Х первой точки, по координатам Y первой точки и т д. Использовать интерфейс Comparator.
➢ Площади, Объемы, Периметры фигур должны храниться в объекте класса-Warehouse.<br/>
➢ Любое изменение параметра фигуры должно вызывать пересчет соответствующих значений в классе- Warehouse.<br/>
Для решения данной задачи использовать паттерны Observer (можно использовать Flow API) и Singleton (потокобезопасные варианты использовать запрещено).<br/>

➢ Save all created objects of geometric shapes in the repository object. Repository pattern.<br/>
➢ Develop specifications for searching for objects and groups of objects in the repository. By ID, by name, by coordinates (for example: find all objects whose points are in the first quadrant, find all surface area objects (volumes, perimeters) of which are enclosed in a given range, find objects located at a distance in a given range from the origin)
➢ Develop methods for adding and removing repository objects.<br/>
Develop methods for sorting sets of objects by ID, by name, by the X coordinates of the first point, by the Y coordinates of the first point, etc. Use the Comparator interface.
➢ Areas, Volumes, Perimeters of shapes must be stored in an object of class-Warehouse.<br/>
➢ Any change to a figure parameter must cause a recalculation of the corresponding values in the Warehouse class.<br/>
To solve this problem, use the Observer patterns (you can use the Flow API) and Singleton patterns (it is forbidden to use thread-safe options).<br/>

