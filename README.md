# FACOM TURISMO

![FACOM Cx1,5](https://github.com/gabrielfresan7/Teste/assets/71043961/4f159577-07b5-4b2b-89d6-76ede90e63d2)


## Introdução
- O **FACOM Turismo** é um sistema de agência de viagens em constante desenvolvimento. O usuário escolhe a origem (no momento, suporta apenas para Uberlândia) e um destino. Assim que escolhido, o sistema oferta hotéis e passeios no itinerário final. O usuário pode acatar nossa sugestão ou pedir para selecionar manualmente. Por fim, passamos os detalhes finais ao usuário através do telefone. 
- Desenvolvemos este software de agência de viagens para transformar os sonhos das pessoas em realidade. Acreditamos que todos merecem momentos de lazer e descanso. Queremos facilitar o acesso a destinos incríveis, conectando as pessoas com experiências memoráveis. Nossa motivação é tornar o planejamento de viagens uma jornada emocionante e sem complicações, proporcionando a todos a oportunidade de explorar o mundo e criar lembranças inesquecíveis.

![xNx9vEU](https://github.com/gabrielfresan7/Teste/assets/71043961/abdf8566-f64c-48b5-986c-6e951790bbc2)

## Padrões de projeto
### Injeção de Dependência

A **injeção de dependência** é um conceito fundamental na engenharia de software, projetado para reduzir o acoplamento entre componentes, tornando o código mais flexível e mais fácil de testar. Em vez de criar manualmente instâncias de classes dependentes, o Spring Framework as fornece automaticamente, garantindo que a classe que as utiliza não precise se preocupar com a criação das dependências.
```
@Service
public class PlaceService {

      @Autowired
      PlaceRepository placeRepository;
```
O código em questão emprega o padrão de injeção de dependência por meio da anotação @Autowired. Essa anotação faz parte do Spring Framework em Java e permite a injeção automática de dependências. 

A classe PlaceRepository  é responsável por operações de persistência de dados relacionadas a lugares em um banco de dados. A dependência entre esta classe e o código em análise é resolvida automaticamente pelo Spring Framework, graças à anotação @Autowired. Isso significa que o PlaceRepository é injetado automaticamente na classe, tornando-a disponível para uso sem a necessidade de instanciação manual. Essa abordagem evita a necessidade de criar manualmente instâncias de PlaceRepository e, portanto, melhora a flexibilidade e a manutenibilidade do código.

### Iterator

O padrão **Iterator** é um padrão de design comportamental que fornece uma maneira de acessar elementos de uma coleção (como uma lista, conjunto, árvore, etc.) sem expor a estrutura interna da coleção. Isso permite que seja possível percorrer os elementos de uma coleção de maneira uniforme, sem se preocupar com a forma como a coleção é implementada.

O padrão Iterator normalmente consiste em duas partes: o Iterator propriamente dito e a coleção a ser percorrida. O Iterator fornece métodos para acessar os elementos da coleção (como next, hasNext, remove, etc.).
```
      int randomlndex = new Random().nextInt(set.size());
      Iterator<T> iterator = set.iterator();
      for (int i = 0; i < randomlndex; i++) {
      iterator.next() ;
      }
      return iterator.next();
    }
```
O código fornecido não usa explicitamente uma implementação de Iterator, mas adota um conceito semelhante. Aqui está como o padrão Iterator é aplicado neste código:

Um objeto Iterator<T> é criado a partir do conjunto (Set) usando set.iterator(). Isso permite percorrer os elementos do conjunto de maneira ordenada, sem a necessidade de conhecer a estrutura interna do conjunto.

Em seguida, um índice aleatório (randomIndex) é gerado, representando a posição do elemento que se deseja acessar.

O loop for é usado para percorrer o Iterator até o índice aleatório ser alcançado. Isso é feito chamando iterator.next() repetidamente. Este é o equivalente a percorrer os elementos até chegar ao elemento desejado.

Após percorrer o conjunto até o índice aleatório, a função retorna o elemento encontrado usando iterator.next().

Embora essa implementação seja uma maneira de acessar um elemento aleatório de um conjunto, ela não fornece todas as funcionalidades tradicionalmente associadas a um Iterator, como a verificação de elementos subsequentes com hasNext() e a remoção de elementos do conjunto com remove(). É uma adaptação simples do conceito de iteração e não segue rigorosamente o padrão Iterator, mas se baseia em princípios semelhantes.

### Singleton

O **Singleton** é um dos escopos de bean padrão no Spring Framework, e é amplamente aplicado em muitos componentes dentro de um aplicativo Spring, incluindo serviços, repositórios e outros. O Singleton garante que uma única instância do bean seja criada e compartilhada em toda a aplicação. 

O seu funcionamento se dá da seguinte forma:

1. Aplicação do Singleton no Spring:

- Escopo Padrão: O Singleton é o escopo padrão no Spring Framework. Isso significa que, a menos que você especifique um escopo diferente, o contêiner IoC do Spring criará uma única instância de um bean e a compartilhará em toda a aplicação. Por exemplo, quando você anota uma classe com "@Service", "@Component", "@Controller", etc., ela é considerada um Singleton por padrão.

- Configuração via Anotação: A anotação "@Scope("singleton")" é usada para explicitamente definir um bean como Singleton, embora seja redundante, já que o Singleton é o escopo padrão.

2. Funcionamento do Singleton:

O funcionamento do Singleton no Spring pode ser resumido da seguinte forma:

- Quando o contêiner IoC do Spring inicializa, ele cria uma instância do bean anotado como Singleton e a mantém em cache.

- Quando um componente solicita esse bean (por meio da injeção de dependência ou de outra maneira), o contêiner fornece a mesma instância em cache.

- Como resultado, todas as partes da aplicação que dependem desse bean trabalham com a mesma instância. Isso é valioso para compartilhar informações, como configurações, conexões de banco de dados ou objetos de cache, em toda a aplicação.

- O Singleton no Spring é thread-safe por padrão. O contêiner Spring garante que a mesma instância seja usada para todas as threads que a solicitam.

3. Usos Comuns do Singleton:

O Singleton é amplamente utilizado para componentes que devem ser compartilhados em toda a aplicação, incluindo:

- Serviços: Componentes que contêm a lógica de negócios e são compartilhados por todas as partes da aplicação.

```
@Service
public class StatisticDataService {
```
- Repositórios: Componentes que lidam com a persistência de dados e são compartilhados por diferentes partes do aplicativo.

```
public interface PlaceRepository extends JpaRepository<Place, Long> {
            Place findPlaceByCity(String city);

}
```

```
@Service
public class PlaceService {
            @Autowired
            PlaceRepository placeRepository;
```
- Configurações: Objetos de configuração que precisam ser lidos e compartilhados em toda a aplicação.
Assim sendo, a capacidade de criar e compartilhar objetos Singleton é essencial para promover o uso eficiente de recursos em um aplicativo e garantir a consistência de dados e configurações em toda a aplicação. O Singleton é particularmente útil para serviços de negócios, repositórios de dados, configurações globais e outras partes do aplicativo que devem ser acessíveis de maneira consistente em várias partes do sistema.

No entanto, é importante destacar que o Spring fornece a flexibilidade de personalizar o escopo de um bean conforme necessário, incluindo escopos de protótipo, escopos específicos do ambiente web e muito mais. Portanto, ao projetar um aplicativo Spring Boot, é essencial considerar cuidadosamente o escopo apropriado para cada componente para atender aos requisitos específicos do aplicativo.

### Model View Controller (MVC)

O padrão de projeto **Model View Controller** oferece benefícios significativos na separação das regras de negócios da lógica de apresentação, permitindo várias interfaces de usuário que podem ser modificadas independentemente das regras de negócios. Essa separação proporciona flexibilidade e reusabilidade, tornando-o aplicável em diversos tipos de projetos, como aplicativos desktop, web e mobile.

Dessa maneira, tem-se como resultado as atualizações na interface do usuário, como mudanças de layout ou tecnologia de exibição,que  podem ser feitas sem afetar as regras de negócios subjacentes. Como consequência, essa separação melhora a manutenção e evita que mudanças na interface afetem a lógica do aplicativo.

No contexto do Spring Boot, o MVC é implementado por meio do framework Spring MVC, que fornece uma estrutura robusta para o desenvolvimento de aplicativos web. 

O Model é geralmente representado por classes de domínio ou entidades que refletem a estrutura de dados do seu aplicativo. Essas classes frequentemente são anotadas com @Entity (para persistência em banco de dados) e podem ser gerenciadas por frameworks como o Spring Data JPA. Abaixo, ilustra-se um exemplo usado no código do aplicativo de agência de viagens:

```
@Entity
@Tab1e(name = "tb_places ")
public class Place implements Serializable{
            private static final long serialVersionUID = 1L;

            @Id
            @Column(name = "place_id" )
            private Long id;
            private String city;
            private String country;

            @OneToMany(mappedBy = "hostingLocal", cascade=CascadeType. ALL, fetch = Fetch Type.LAZY)
            @JsonManagedReference
            private Set<Hosting> hostings = new HashSet<>();

            @OneToMany(mappedBy = "destinationLocal", cascade=CascadeType.ALL, fetch = Fetch Type.LAZY)
            @JsonManagedReference
            private Set<Ticket> tickets = new HashSet<>();

            @OneToMany(mappedBy = "tourLocal" , cascade=CascadeType.ALL, fetch = FetchType.LAZY)
            @JsonManagedReference
            private Set<Tour> tours = new HashSet<>();
```

Já o View, são geralmente páginas HTML, mas também podem ser templates Thymeleaf, FreeMarker, JSP ou outras tecnologias de renderização de páginas. O Spring Boot é flexível e permite escolher a tecnologia de view mais adequada para o seu projeto.

```
public static void main(String[] args) {
      SpringApplication.run(Application.class, args);

      abrirPaginaHTML() ;
}

private static void abrirPaginaHTML() {
      String htmlFilePath = "C:\\Users\\gaevange1ista\\Desktop\\app-viagens\\Arquivo da IDE\\App de viagens\\src\\main\\resources\\Frontend\\home.html";
      String browserCommand = "cmd /c start \"\" \"" + htmlFilePath + "\"";

      try {
            Runtime.getRuntime( ).exec(browserCormand) ;
      } catch (IOException e) {
            System.out.println("Erro ao abrir a pågina HTML: " + e.getMessage());
      }
}
```

Por fim, os controllers do Spring Boot são classes Java anotadas com @Controller, @RestController, ou outras anotações específicas para controladores. Eles são responsáveis por mapear URLs para métodos de ação em seu aplicativo.
Os métodos dos controllers são anotados com @RequestMapping, @GetMapping, @PostMapping, e outras anotações similares para indicar qual URL eles manipulam. Por exemplo, o @GetMapping("/pagina") em nosso exemplo anterior mapeia a URL "/página" para o método exibirPagina .Os controllers podem receber parâmetros da solicitação, como  dados do formulário, parâmetros de URL ou cabeçalhos, processar a lógica de negócios e retornar a View adequada.

```
@RestController
@RequestMapping("clients")
public class ClientRequestController {

            @Autowired
            private PlaceService placeService;

            @GetMapping(value = "/roadmap/{city}")
            public ResponseEntity<PlaceDTO> findRoadMap (@PathVariable String city) {
                  return ResponseEntity.ok(placeService.getRandomRoadMap(city));
            }

            @GetMapping("/all/{city}")
            public ResponseEntity<PlaceDTO> findPlaceByCity(@PathVariable String city) {
                  return ResponseEntity.ok(placeService.findPlaceByCity(city));
            }

            @Autowired
            RoteiroService roteiroService;


            @PostMapping(value = "/roteiro")
            public void postRoteiro(@RequestBody RoadMapDTO roteiroDTO) {
                  roteiroService.saveRoteiro(roteiroDTO);
            }

}
```

### Data Transfer Object (DTO)

O padrão de projeto **DTO (Data Transfer Object)** e **TO (Transfer Object)** é amplamente empregado na programação Java, incluindo em projetos baseados no Spring Boot, para facilitar o transporte de dados entre diferentes componentes de um sistema, entre diferentes instâncias ou processos de um sistema distribuído e até entre sistemas diferentes, usando serialização. No contexto do Spring Boot, a ideia fundamental por trás desse padrão consiste em agrupar um conjunto de atributos em uma classe simples, otimizando assim a comunicação entre esses componentes.

![ih](https://github.com/gabrielfresan7/Teste/assets/71043961/21cc0890-80e3-4b25-b730-42310eeadc02)

No Spring Boot, o uso de DTO/TO se torna particularmente valioso em chamadas remotas ou em cenários onde a comunicação entre componentes é necessária. Passar cada atributo individualmente seria ineficiente, e, da mesma forma, passar uma entidade mais complexa, como uma entidade JPA, pode não ser a solução ideal. Além disso, muitas vezes os dados usados na comunicação não correspondem exatamente aos atributos do modelo de dados da aplicação. Nesse contexto, o uso de DTO/TO permite criar classes que fornecem exatamente o que é necessário para um processo específico no ambiente Spring Boot.

A utilização de DTOs também é comum para mapear informações obtidas do banco de dados e apresentá-las em um ambiente MVC (Model-View-Controller). Embora isso possa otimizar a exibição dos dados, é importante observar que pode resultar em um modelo (Model) poluído com informações redundantes. No entanto, essa prática é viável e frequente, desde que seja aplicada com cautela para evitar o inchaço no modelo.

Quando o domínio do aplicativo Spring Boot é bem estruturado e segue um modelo de dados sólido, a preferência é criar beans que representam esse modelo, frequentemente chamados de Entidades JPA. Esses beans servem como representações fiéis do domínio. No entanto, em casos específicos, como consultas complexas no banco de dados que envolvem junções (joins) ou visualizações (views), a criação de DTOs ou TOs pode ser apropriada. Isso simplifica o transporte e manipulação dos dados, preservando a clareza do modelo de domínio no contexto do Spring Boot.

A seguir, um exemplo de como o padrão é aplicado no contexto do aplicativo de agência de viagens:

```
@Autowired
RoteiroService roteiroService;

@PostMapping(value = "/roteiro")
public void postRoteiro(@RequestBody RoadMapDTO roteiroDTO) {
      roteiroService.saveRoteiro(roteiroDTO);
}
```
Trecho de código do controller “ClientRequestController” onde o DTO está sendo usado para receber os dados enviados pelo cliente e passá-los para a classe de serviço.
```
@Service
public class RoteiroService {
            @Autowired
            RoteiroRepository roteiroRepository;

            @Transactional
            public void saveRoteiro(RoadMapDTO roteiroDTO) {
                  roteiroRepository.save(new RoadMap (roteiroDTO))
            }


}
```
Na classe de serviço, os dados recebidos pelo DTO são passados como parâmetros para a criação de uma nova entidade “RoadMap” (Roteiro de viagem).

## Princípios de projeto
### Responsabilidade Única ou Separação de Responsabilidades
O primeiro princípio de **"Separação de Responsabilidades"** (SoC - Separation of Concerns) é um conceito fundamental em design de software que sugere que um sistema de software deve ser dividido em partes distintas, cada uma com uma responsabilidade única e bem definida. A ideia por trás desse princípio é evitar a mistura de diferentes preocupações ou responsabilidades em uma única parte do código, tornando-o mais organizado, legível, testável e fácil de manter.

No contexto dos controllers no Spring Boot, a separação de responsabilidades é aplicada da seguinte forma:

1. Controllers: Os controllers são responsáveis por lidar com a lógica de apresentação, incluindo a recepção de solicitações HTTP, roteamento para as ações apropriadas e preparação dos dados necessários para a resposta. Eles não devem conter lógica de negócios complexa, mas sim coordenar a interação entre o cliente e a camada de serviço.

2. Camada de Serviço (Service Layer): A lógica de negócios é isolada na camada de serviço. Esta camada é responsável por executar as operações de negócios, aplicando regras de negócios, acessando dados (geralmente por meio de repositórios) e fornecendo serviços específicos para atender às necessidades do aplicativo. A separação entre a camada de serviço e os controllers garante que a lógica de negócios seja mantida de forma independente e pode ser reutilizada em diferentes partes do aplicativo.

3. Modelo (Model): O modelo representa os dados que são manipulados pelo aplicativo. Os controllers interagem com o modelo para obter ou fornecer dados, mas a manipulação dos dados em si ocorre na camada de serviço. A separação do modelo ajuda a garantir que a representação dos dados seja clara e independente das preocupações de apresentação.

A separação de responsabilidades facilita a manutenção e a evolução do código, uma vez que cada parte do aplicativo tem um foco bem definido. Além disso, torna os controllers mais leves, concentrados em lidar com a interação com o cliente e delegando as operações de negócios à camada de serviço. Isso também é benéfico para a testabilidade, já que cada parte isolada pode ser testada independentemente.

Em resumo, o princípio de "Separação de Responsabilidades" enfatiza a importância de manter as responsabilidades distintas e bem definidas em diferentes partes do código, promovendo a modularidade, reusabilidade e manutenção mais eficaz. Isso é aplicado nos controllers do Spring Boot para manter o código organizado e de fácil gerenciamento.
```
      public <T> T getRandomSet(Set<T> set) {
      if (set == null || set.isEmpty()) {
            return null;
      }
      int randomlndex = new Random().nextInt(set.size());
      Iterator<T> iterator = set.iterator();
      for (int i = 0; i < randomlndex; i++) {
      iterator.next();
      }
      return iterator. next();
}

public PlaceDTO getRandomRoadMap(String city) {
      Place place = placeRepository.findPlaceByCity(city);
      if (place == null) {
      return null;
      }
      PlaceDTO roadMapPlaceDTO = new PlaceDTO(place);
      roadMapPlaceDTO.setTickets(Collections.singleton(getRandomSet (place.getTickets())));
      roadMapPlaceDTO.setHostings(Collections.singleton(getRandomSet(place.getHostings())));
      roadMapPlaceDTO.setTours(Collections.singleton(getRandomSet(place.getTours())));
      return roadMapPlaceDTO;
}
```
### Inversão de Dependência
A **Inversão de Dependência** (IoC - Inversion of Control) é um princípio de design fundamental e um pilar central do funcionamento do Spring Framework e, por extensão, do Spring Boot. Esse conceito revoluciona a maneira como gerenciamos as dependências e o controle dentro de um aplicativo, transferindo a responsabilidade do controle da criação e gerenciamento de objetos de uma classe para outra. Em vez de uma classe criar suas próprias dependências, ela as recebe de uma fonte externa, frequentemente chamada de contêiner IoC.

No contexto do Spring Boot, a Inversão de Dependência é implementada de várias maneiras:

1. Contêiner de Inversão de Controle: O Spring Boot incorpora um contêiner IoC robusto que gerencia a criação e o ciclo de vida de objetos, geralmente chamados de beans, em um aplicativo. O contêiner IoC do Spring assume a responsabilidade de criar, configurar e injetar as dependências necessárias nas classes, incluindo controllers, serviços e repositórios.

2. Injeção de Dependência: A Injeção de Dependência é uma técnica essencial no contexto da Inversão de Dependência, onde as dependências de um objeto são injetadas nele em tempo de execução. Isso elimina a necessidade de criar manualmente instâncias de dependências e é amplamente utilizado no Spring Boot por meio de anotações como "@Autowired", "@Service", "@Repository" e outras. A injeção de dependência permite a conexão eficiente de componentes do aplicativo e o gerenciamento de suas dependências.

A seguir, um exemplo de código presente na aplicação construída para ilustrar os tópicos descritos:

```
@Service
public class RoteiroService {
            @Autowired
            RoteiroRepository roteiroRepository;

            @Transactional
            public void saveRoteiro(RoadMapDTO roteiroDTO) {
                  roteiroRepository.save(new RoadMap (roteiroDTO))
            }


}
```

3. Configuração Externa: O Spring Boot promove a configuração externa, onde muitos aspectos do aplicativo podem ser configurados por meio de arquivos externos, como "application.properties" ou "application.yml". Isso segue o princípio do IoC, onde o controle da configuração é invertido para uma fonte externa, permitindo a flexibilidade na configuração do aplicativo sem a necessidade de alterar o código-fonte.

4. Desacoplamento: A Inversão de Dependência promove o desacoplamento entre os componentes do aplicativo. Isso significa que as classes são menos dependentes de detalhes de implementação de outras classes, o que torna o código mais flexível, testável e de fácil manutenção.

A Inversão de Dependência oferece diversos benefícios significativos:

- Facilitação de Testes: A injeção de dependência simplifica a criação de testes unitários e de integração, permitindo a injeção de dependências falsas ou simuladas para testar componentes de forma isolada.

- Flexibilidade: Alterar ou estender o comportamento do aplicativo torna-se mais simples, pois é possível substituir implementações de dependências sem modificar o código que as utiliza.

- Reutilização de Componentes: Por meio da injeção de dependência, é possível reutilizar componentes em diferentes partes do aplicativo, promovendo a reutilização de código e reduzindo a duplicação.

- Manutenção Facilitada: O código é mais fácil de manter, uma vez que as dependências são gerenciadas centralmente pelo contêiner IoC, tornando as atualizações e correções mais controladas e menos propensas a efeitos colaterais indesejados.

Em suma, a *Inversão de Dependência* é um princípio fundamental no desenvolvimento de aplicativos com Spring Boot, promovendo a modularidade, o desacoplamento e a flexibilidade. O Spring Boot utiliza o contêiner IoC e a injeção de dependência para gerenciar eficazmente as dependências e configurações do aplicativo, facilitando a criação de aplicativos robustos e de fácil manutenção. Com essa abordagem, o Spring Boot se torna uma ferramenta poderosa para a criação de aplicativos empresariais altamente flexíveis e testáveis.

### Prefira Composição a Herança
O Spring é fundamentado em princípios de design e boas práticas de programação que favorecem a composição sobre a herança. Este princípio é uma das diretrizes centrais do design orientado a objetos e promove a criação de código mais flexível, reutilizável e de fácil manutenção.

A herança tende a criar um forte acoplamento entre classes, o que pode tornar o código mais rígido e difícil de modificar. O Spring promove o desacoplamento, onde os componentes são independentes uns dos outros e comunicam-se por meio de interfaces bem definidas. Esse desacoplamento facilita a substituição ou modificação de componentes sem afetar outras partes do sistema. 

Dessa maneira, o framework foi projetado com um foco claro na reutilização de componentes, o que possibilita que ao invés de criar-se hierarquias complexas de classes com base na herança, o Spring permite criar componentes independentes e configuráveis. A injeção de dependência é uma técnica central que permite que esses componentes sejam compostos de forma flexível para atender às necessidades específicas de um aplicativo. Isso torna mais fácil reutilizar código e construir sistemas com um conjunto diversificado de componentes.


Podemos ver no exemplo abaixo:

```
@RestController
@RequestMapping("clients")
public class ClientRequestController {

            @Autowired
            private PlaceService placeService;

            @GetMapping(value = "/roadmap/{city}")
            public ResponseEntity<PlaceDTO> findRoadMap (@PathVariable String city) {
                  return ResponseEntity.ok(placeService.getRandomRoadMap(city));
            }

            @GetMapping("/all/{city}")
            public ResponseEntity<PlaceDTO> findPlaceByCity(@PathVariable String city) {
                  return ResponseEntity.ok(placeService.findPlaceByCity(city));
            }

            @Autowired
            RoteiroService roteiroService;


            @PostMapping(value = "/roteiro")
            public void postRoteiro(@RequestBody RoadMapDTO roteiroDTO) {
                  roteiroService.saveRoteiro(roteiroDTO);
            }

}
```

Assim, a composição torna mais fácil a criação de testes unitários e de integração, pois você pode injetar dependências falsas ou simuladas para testar componentes individualmente. 

Logo, o princípio de projeto “Prefira composição a herança” resulta em sistemas mais modulares, reutilizáveis, desacoplados e testáveis, o que facilita a manutenção e a evolução dos aplicativos ao longo do tempo. A ênfase na composição ajuda os desenvolvedores a criar sistemas mais flexíveis e adaptáveis, refletindo as melhores práticas de design orientado a objetos e engenharia de software.

## Framework: Spring Boot

O **Spring Boot** é um framework do ecossistema Spring que tem como objetivo simplificar o
desenvolvimento de aplicativos Java. Ele fornece uma abordagem fácil e rápida para criar
aplicativos Java autônomos, prontos para produção, com configuração mínima. Por conta disso, decidimos usá-lo.

Código que ilustra o framework e nos ajuda a implementar as estatísticas.
```
@Service
public class StatisticDataService {

      @Autowired
      RoteiroRepository roteiroRepository;
      
      @Transactional
      public StatisticDataDTO getDadosEstatisticos() {
            List<RoadMap> result = roteiroRepository.findAll();
            Iterator<RoadMap> iter = result.iterator();
            double totalEarnings = 0;
            int peopleNum = 0;
            int ctSp = 0;
            int ctRj = 0;
            int ctSvd = 0;
            int ctCtb = 0;
            int ctRcf = 0;
            int highestVisitsNumber = 0;
            
            String mostVisitedCity = "";
            String[] cities = { "Sao Paulo", "Rio de Janeiro", "Curitiba", "Recife", "Salvador");
            
            HashMap<String, Integer> dataCount = new HashMap<>();
            String mostlnsertedDate = "";
            int mostDate = 0;
            
            HashMap<String, Integer> companhiaCount = new HashMap<>();
            String mostlnsertedCompany = "";
            int mostCompany = 0;
            
            while (iter.hasNext()) {
                  RoadMap roteiro = iter.next();
                  String localName = roteiro.getLocalName();
                  String date = roteiro.getDepartionDate();
                  String ticketCompany = roteiro.getTicketCompany();
```

Uma das principais vantagens do Spring Boot é a simplificação do desenvolvimento, facilitando a implementação de padrões de projeto, como Injeção de Dependência e o padrão MVC. Isso resulta em maior produtividade, graças à configuração automática que reduz o tempo gasto em configurações manuais. Além disso, o Spring Boot integra nativamente o padrão MVC, o que facilita o desenvolvimento de aplicativos web e oferece suporte eficaz para a criação de microserviços. A estrutura também promove a testabilidade, tornando mais fácil escrever testes unitários e de integração, além de contar com uma comunidade ativa e vasta documentação. A segurança é outra vantagem, pois o Spring Boot oferece recursos de segurança robustos.

Por outro lado, o Spring Boot também possui desvantagens. Em alguns casos, a abundância de padrões de projeto pode levar a um excesso de complexidade, tornando o desenvolvimento mais desafiador. A curva de aprendizado pode ser íngreme, uma vez que os desenvolvedores precisam compreender os vários padrões e configurações para usá-lo efetivamente. O tamanho do pacote gerado pode ser maior devido à inclusão de bibliotecas e configurações padrão, o que pode afetar o desempenho e o consumo de recursos. Além disso, o uso excessivo de padrões de projeto pode resultar em overhead de memória e CPU. Em alguns casos, desenvolvedores podem aplicar mais padrões do que o necessário, resultando em superengenharia. Para projetos simples, a configuração automática do Spring Boot pode parecer excessiva. Portanto, ao optar pelo Spring Boot, é essencial ponderar essas vantagens e desvantagens à luz das necessidades específicas do projeto.
## Conclusão
Portanto, ao utilizar o próprio framework, pudemos observar como os padrões de projeto são tão úteis que muitos deles estão incorporados nos métodos disponibilizados pelos frameworks. Isso significa que qualquer programador que utiliza um framework precisa se adaptar ao uso de vários padrões, muitas vezes sem compreender completamente por que e como cada funcionalidade disponível funciona. É por isso que a matéria que nos guiou na identificação de como cada padrão auxilia e resolve problemas desempenhou um papel crucial.

Além disso, a manutenção das boas práticas de design desde o início do projeto ajudou o grupo como um todo a entender mais facilmente as contribuições individuais de cada membro. Antes de iniciar, definimos como iríamos dividir os arquivos e nomear as constantes e variáveis, o que contribuiu significativamente para a clareza e eficiência de nosso trabalho em equipe.

Uma das partes mais desafiadoras do processo foi compreender como o framework fazia uso dos padrões de projeto para simplificar o problema que se propunha a resolver. Investigar a documentação e explorar os métodos disponíveis foi fundamental para entender não apenas a necessidade de usar um padrão específico, mas também a razão por trás da passagem de determinados parâmetros e a importância de formatar documentos de uma maneira específica.

## Autores

- Gabriel Freitas Santos – 11821BSI264
- Giovanna Maria Alves Evangelista – 12121BSI266
- Henrick Oliveira de Souza – 12121BSI237
