import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.exitProcess

public fun randomperson(): String {
    var list = lists().people
    var person: String = list[Random.nextInt(0..list.size - 1)]
    return person
}

public fun randomverb(): String {
    var list = lists().verbs
    var verb: String = list[Random.nextInt(0..list.size - 1)]
    return verb
}

public fun randomaction(verb: String): String {
    var list = lists.action().verb[verb]
    var action: String = list!!.get(Random.nextInt(0..list.size - 1))
    return action
}

fun get_all(){
    var person = randomperson()
    var verb = randomverb()
    var action = randomaction(verb)
    println(person+" "+verb+" "+action)
}

class commandsclass {
    var names = arrayOf("exit", "help", "roll")
    var functions = mapOf("exit" to fun() {
        exitProcess(1)
    }, "help" to fun(){
        println("placeholder until I create a readme")
    }, "roll" to fun(){
        get_all()
    })
}

class lists {
    var people = arrayOf("Homelander",
        "SpongeBob SquarePants",
        "Will Smith",
        "Curious George",
        "Joker",
        "Shrek",
        "Andrew Tate",
        "Patrick Star",
        "Sandy Cheeks",
        "Eugene Krabs",
        "Sheldon Plankton",
        "Chinese Eggman",
        "Saul Goodman / Jimmy McGill",
        "Andrew Garfield",
        "Tobey Maguire",
        "Tom Holland",
        "Finger / Mike Ehrmantraut",
        "Gustavo Fring",
        "Jesse Pinkman",
        "Walter White",
        "Dora",
        "Michael Morbious",
        "Spy from TF2",
        "superman",
        "batman",
        "Bill nye",
        "Black Bolt",
        "Peter Griffin",
        "Frog man",
        "Cuphead",
        "Mugman",
        "Grug",
        "Tim Lockwood",
        "Palpatine",
        "Sonic the hedgehog",
        "waluigi",
        "Talking Ben",
        "Deadpool",
        "Morshu",
        "The Hulk",
        "She-Hulk",
        "Markiplier",
        "Stewie Griffin",
        "Thor",
        "Jason Vorhees",
        "Freddy Kreuger",
        "Freddy Fazbear",
        "Ghostrider",
        "Ghostface",
        "Predator",
        "Alien",
        "SCP(your choice)",
        "Dracula",
        "Frankenstein's Monster",
        "The Wolf Man",
        "Gizmo the gremlin",
        "Leatherface",
        "Mummy",
        "Chucky",
        "Carnage",
        "Invisible Man",
        "Slappy from Goosebumps",
        "Patrick Bateman",
        "Pyramid Head",
        "Leaprechaun",
        "Carrie",
        "Moon Knight",
        "Leatherface",
        "Mario",
        "Luigi",
        "Princess Peach",
        "Princess Daisy",
        "Bowser",
        "Bowser Jr",
        "Thanos",
        "Harley Quinn",
        "Cristiano Ronaldo",
        "KSI",
        "Logan Paul",
        "Cardi B",
        "Steve Harvey",
        "Elon Musk",
        "Mr. Bean",
        "Snoop Dogg",
        "Butcher",
        "Johnny Depp",
        "Jacksepticeye",
        "a monke",
        "Pikachu",
        "ishowspeed",
        "dancing roach",
        "baby yoda",
        "Darth Vader ",
        "Rick Astley",
        "NFT monke",
        "big nose Spider-Man",
        "XCMSHOW",
        "Daredevil",
        "a cat",
        "doge",
        "a shark",
        "Scarlet witch",
        "a Discord mod",
        "a Twitch streamer",
        "a news announcer",
        "Captain America",
        "Captain underpants",
        "Iron man",
        "Punisher",
        "LETS GOOOOOOOOOOOOOO ball",
        "a spooky skeleton",
        "a furry",
        "the minions",
        "Gru",
        "Amogus",
        "Optimus prime",
        "Bumblebee the transformer",
        "Barry B. Benson",
        "Juan the horse",
        "the lawyer from the Bee Movie",
        "Mysterio",
        "Shadow the hedgehog",
        "Tails the fox",
        "Knuckles the echidna",
        "Man-thing",
        "Eminem",
        "She-Hulk",
        "the Demogorgon",
        "Eleven from stranger things",
        "Gus Fring",
        "Korg from Thor",
        "Zeus",
        "Kratos",
        "Howard Hamlin",
        "Smelvin",
        "a Leviathan from Subnautica",
        "Miles Morales",
        "the little mermaid",
        "Amber Heard",
        "Aquaman",
        "Cyborg",
        "The teen titans",
        "Charizard",
        "Greg from diary of a wimpy kid",
        "Pac man",
        "America Chavez",
        "Minecraft Steve",
        "Dhar man",
        "Peppa pig",
        "Hello Kitty",
        "A-train",
        "The Deep",
        "Ms. marvel",
        "general Grevious",
        "PVZ zombie",
        "PVZ onion",
        "clash Royale Bowler",
        "Yoshi",
        "the Koopalings",
        "the Flash",
        "Hawk man",
        "Green lantern",
        "Black widow",
        "Japanese Spider-Man",
        "Mammot from my singing monsters",
        "Furcorn from my singing monsters",
        "Mister Fantastic",
        "WONG",
        "Jesus",
        "Herbert",
        "Senator Armstrong",
        "Robbie rotten")
    var verbs = arrayOf("gets",
        "does",
        "avoids",
        "makes",
        "finds",
        "plays",
        "learns",
        "spends",
        "beats",
        "cooks",
        "loses",
        "paints",
        "kills")
    class action {
        var verb = mapOf(
            "gets" to arrayOf("McDonalds",
                "shot",
                "their credit card info stolen",
                "eaten",
                "scurvy",
                "Cancer and has to cook meth",
                "wings",
                "hit by a truck",
                "their pizza stolen",
                "kissed by their homie",
                "real",
                "combusts",
                "stabbed in Britain",
                "in the iron man suit",
                "Covid",
                "canceled",
                "sent to prison",
                "added to smash",
                "destroyed",
                "bitches"),
            "does" to arrayOf("the griddy",
                randomperson() + "'s homework",
        "not like their veggies",
        "not need auto-tune",
        "a flip",
        "the ice bucket challenge",
        "absolutely nothing"),
        "avoids" to arrayOf("a nuclear bomb",
            "a flashbang",
            "getting hit by a truck",
            "getting canceled",
            "getting vaporized",
            "your mom"),
        "makes" to arrayOf( "a minecraft house",
            "A campfire",
            "Tobey Maguire cry",
            "a meme",
            "A game",
            "a movie"),
        "finds" to arrayOf("you",
            "your IP address",
            "$1M",
            "the Blue Stuff"),
        "plays" to arrayOf("Valorant",
            "Minecraft",
            "Multiversus",
            "CS:GO",
            "Fortnite",
            "Fall Guys",
            "Among Us",
            "GTA",
            "Jenga",
            "Mario bros",
            "TF2",
            "Garry's mod",
            "Multiversus",
            "my singing monsters",
            "terraria",
            "FNAF",
            "A star wars game",
            "Spider-Man PS4"),
        "learns" to arrayOf("how to read",
            "how do math",
            "to how to play a trombone",
            "how to return to monke",
            "how to kill",
            "why 9+10=21",
            "how to install gentoo",
            "how to cook crystal meth",
            "to play the violin",
            "The truth of the universe",
            "About fnaf lore",
            "why their dad didnt return with the milk"),
        "spends" to arrayOf("money on a new car",
            "money at a store",
            "time in school",
            "time at the zoo",
            "their life savings on a Pokemane donation",
            "all their VBucks",
            "time in prison (Dropped Soap)",
            "an hour debugging code"),
        "beats" to arrayOf("Call of Duty zombies",
            randomperson() + " in Mario Kart",
        "the IRS",
        "Minecraft"),
        "cooks" to arrayOf("meth",
            "Burgers",
            "a pizza",
            "someone alive"),
        "loses" to arrayOf("at jenga",
            "their mind",
            "all their Vbucks",
            "their life",
            "their dignity",
            "their Minecraft world"),
        "paints" to arrayOf("A picture of " + randomperson(),
        "an NFT"),
        "kills" to arrayOf(randomperson())
        )

    }

}



fun main() {
    var commands = commandsclass()
    var input = readln()
    for (index in 0..commands.names.size-1)
    {
        if (input == commands.names[index]) {
            var command = commands.names[index]
            var function = commands.functions[command]
            function?.invoke()
            main()
        }
    }
}


