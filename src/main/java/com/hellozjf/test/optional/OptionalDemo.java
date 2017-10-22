package com.hellozjf.test.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OptionalDemo {
    
    private static final Logger LOG = LoggerFactory.getLogger(OptionalDemo.class);

    public static void main(String[] args) {
        // 创建Optional实例，也可以通过方法返回值得到。
        Optional<String> name = Optional.of("Sanaulla");

        // 创建没有值的Optional实例，例如值为'null'
        Optional empty = Optional.ofNullable(null);

        // isPresent方法用来检查Optional实例是否有值。
        if (name.isPresent()) {
            // 调用get()返回Optional值。
            LOG.debug("{}", name.get());
        }

        try {
            // 在Optional实例上调用get()抛出NoSuchElementException。
            LOG.debug("{}", empty.get());
        } catch (NoSuchElementException ex) {
            LOG.debug("{}", ex.getMessage());
        }

        // ifPresent方法接受lambda表达式参数。
        // 如果Optional值不为空，lambda表达式会处理并在其上执行操作。
        name.ifPresent((value) -> {
            LOG.debug("{}", "The length of the value is: " + value.length());
        });

        // 如果有值orElse方法会返回Optional实例，否则返回传入的错误信息。
        LOG.debug("{}", empty.orElse("There is no value present!"));
        LOG.debug("{}", name.orElse("There is some value!"));

        // orElseGet与orElse类似，区别在于传入的默认值。
        // orElseGet接受lambda表达式生成默认值。
        LOG.debug("{}", empty.orElseGet(() -> "Default Value"));
        LOG.debug("{}", name.orElseGet(() -> "Default Value"));

        try {
            // orElseThrow与orElse方法类似，区别在于返回值。
            // orElseThrow抛出由传入的lambda表达式/方法生成异常。
            empty.orElseThrow(ValueAbsentException::new);
        } catch (Throwable ex) {
            LOG.debug("{}", ex.getMessage());
        }

        // map方法通过传入的lambda表达式修改Optonal实例默认值。
        // lambda表达式返回值会包装为Optional实例。
        Optional<String> upperName = name.map((value) -> value.toUpperCase());
        LOG.debug("{}", upperName.orElse("No value found"));

        // flatMap与map（Funtion）非常相似，区别在于lambda表达式的返回值。
        // map方法的lambda表达式返回值可以是任何类型，但是返回值会包装成Optional实例。
        // 但是flatMap方法的lambda返回值总是Optional类型。
        upperName = name.flatMap((value) -> Optional.of(value.toUpperCase()));
        LOG.debug("{}", upperName.orElse("No value found"));

        // filter方法检查Optiona值是否满足给定条件。
        // 如果满足返回Optional实例值，否则返回空Optional。
        Optional<String> longName = name.filter((value) -> value.length() > 6);
        LOG.debug("{}", longName.orElse("The name is less than 6 characters"));

        // 另一个示例，Optional值不满足给定条件。
        Optional<String> anotherName = Optional.of("Sana");
        Optional<String> shortName = anotherName.filter((value) -> value.length() > 6);
        LOG.debug("{}", shortName.orElse("The name is less than 6 characters"));

    }

}
