import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;


    public class Main extends ListenerAdapter{
        public static void main(String[] args) throws LoginException{
            JDABuilder builder = new JDABuilder(AccountType.BOT);
            String token = "NDEyNDI5Nzg0ODI0NTQ1Mjgw.DWK-RA.-Iilt17OeuEGOvWMoX8XzDkhWGY";
            builder.setToken(token);
            builder.addEventListener(new Main());
            builder.buildAsync();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("We received a message from " +
        event.getAuthor().getName() + ": " +
        event.getMessage().getContentDisplay());
        if(event.getMessage().getContentRaw().equals("!ping")){

            event.getChannel().sendMessage("Pong!").queue();
        }
        if(event.getMessage().getContentRaw().equals("!hi")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Monday")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Tuesday")){

            event.getChannel().sendMessage("Here's what's due Tuesday: \n Gatsby Chapters 8 - end discussion").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Wednesday")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Thurday")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Friday")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Saturday")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Sunday")){

            event.getChannel().sendMessage("What is up dawg???").queue();
        }

        if(event.getAuthor().isBot()){
            return;
        }
    }





}
