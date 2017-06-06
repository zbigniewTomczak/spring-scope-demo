package pl.besharp.scopesdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class InjectableComponent {

	public void call(int num) {
		for (int i = 0; i < 10; i++) {
			System.out.print(num);
		}
		System.out.println();
	}
}
